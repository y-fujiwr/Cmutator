package jp.ac.osaka_u.ist.sel.cmutator;

import jp.ac.osaka_u.ist.sel.cmutator.data.Block;
import jp.ac.osaka_u.ist.sel.cmutator.data.Word;
import no.uib.cipr.matrix.DenseVector;
import cc.mallet.types.*;
import cc.mallet.pipe.*;
import cc.mallet.pipe.iterator.*;
import cc.mallet.topics.*;

import java.util.*;
import java.util.regex.*;
import java.io.*;

public class TopicModel {

	public void outputBlockList() throws Exception{
		PrintWriter output = new PrintWriter (new BufferedWriter(new FileWriter ((new File("document.txt")))));
		//model.printDocumentTopics(out1);
		for (Block block : CMutator.blockList) {
			output.printf("%012d\tX\t", block.getId());
			for(Word word: block.getWordList()){
				for(int i=0;i<word.getCount();i++){
					output.printf("%s ", word.getName());
				}
			}
			output.println();
		}
		output.close();
	}
		
		
		
	public static void calculate(int numTopics) throws Exception {

		// Begin by importing documents from text to feature sequences
		ArrayList<Pipe> pipeList = new ArrayList<Pipe>();

		// Pipes: lowercase, tokenize, remove stopwords, map to features
		pipeList.add( new CharSequenceLowercase() );
		pipeList.add( new CharSequence2TokenSequence(Pattern.compile("\\p{L}[\\p{L}\\p{P}]+\\p{L}")) );
		pipeList.add( new TokenSequenceRemoveStopwords(new File("stoplists/java.txt"), "UTF-8", false, false, false) );
		pipeList.add( new TokenSequence2FeatureSequence() );

		InstanceList instances = new InstanceList (new SerialPipes(pipeList));

		Reader fileReader = new InputStreamReader(new FileInputStream(new File("document.txt")), "UTF-8");
		instances.addThruPipe(new CsvIterator (fileReader, Pattern.compile("^(\\S*)[\\s,]*(\\S*)[\\s,]*(.*)$"),
											   3, 2, 1)); // data, label, name fields

		// Create a model with 100 topics, alpha_t = 0.01, beta_w = 0.01
		//  Note that the first parameter is passed as the sum over topics, while
		//  the second is 
		//int numTopics = 100;
		ParallelTopicModel model = new ParallelTopicModel(numTopics, 1.0, 0.01);

		model.addInstances(instances);

		// Use two parallel samplers, which each look at one half the corpus and combine
		//  statistics after every iteration.
		model.setNumThreads(4);
		model.setTopicDisplay(1000, 10);

		// Run the model for 50 iterations and stop (this is for testing only, 
		//  for real applications, use 1000 to 2000 iterations)
		model.setNumIterations(1000);
		model.estimate();

		// Show the words and topics in the first instance

		// The data alphabet maps word IDs to strings
		Alphabet dataAlphabet = instances.getDataAlphabet();
		
		FeatureSequence tokens = (FeatureSequence) model.getData().get(0).instance.getData();
		LabelSequence topics = model.getData().get(0).topicSequence;
		
		Formatter out = new Formatter(new StringBuilder(), Locale.US);
		for (int position = 0; position < tokens.getLength(); position++) {
			out.format("%s-%d ", dataAlphabet.lookupObject(tokens.getIndexAtPosition(position)), topics.getIndexAtPosition(position));
		}
		//System.out.println(out);
		
		// Estimate the topic distribution of the first instance, 
		//  given the current Gibbs state.
		double[] topicDistribution = model.getTopicProbabilities(0);

		// Get an array of sorted sets of word ID/count pairs
		ArrayList<TreeSet<IDSorter>> topicSortedWords = model.getSortedWords();
		
		// Show top 5 words in topics with proportions for the first document
		for (int topic = 0; topic < numTopics; topic++) {
			Iterator<IDSorter> iterator = topicSortedWords.get(topic).iterator();
			
			out = new Formatter(new StringBuilder(), Locale.US);
			out.format("%d\t%.3f\t", topic, topicDistribution[topic]);
			int rank = 0;
			while (iterator.hasNext() && rank < 5) {
				IDSorter idCountPair = iterator.next();
				out.format("%s (%.0f) ", dataAlphabet.lookupObject(idCountPair.getID()), idCountPair.getWeight());
				rank++;
			}
			//System.out.println(out);
		}
	
		// Create a new instance with high probability of topic 0
		StringBuilder topicZeroText = new StringBuilder();
		Iterator<IDSorter> iterator = topicSortedWords.get(0).iterator();

		int rank = 0;
		while (iterator.hasNext() && rank < 5) {
			IDSorter idCountPair = iterator.next();
			topicZeroText.append(dataAlphabet.lookupObject(idCountPair.getID()) + " ");
			rank++;
		}

		// Create a new instance named "test instance" with empty target and source fields.
		InstanceList testing = new InstanceList(instances.getPipe());
		testing.addThruPipe(new Instance(topicZeroText.toString(), null, "test instance", null));

		TopicInferencer inferencer = model.getInferencer();
		double[] testProbabilities = inferencer.getSampledDistribution(testing.get(0), 10, 1, 5);
		//System.out.println("0\t" + testProbabilities[0]);
		
		
		PrintWriter output = new PrintWriter (new BufferedWriter(new FileWriter ((new File(CMutator.DATASET_FILE)))));
		
		ArrayList<TopicAssignment> data = model.getData();
		int[] topicCounts = new int[ numTopics ];
		for (int doc = 0; doc < data.size(); doc++) {
			DenseVector vector = new DenseVector(numTopics);
			LabelSequence topicSequence = (LabelSequence) data.get(doc).topicSequence;
			int[] currentDocTopics = topicSequence.getFeatures();
			int docLen = currentDocTopics.length;
			
			
			for (int token=0; token < docLen; token++) {
				topicCounts[ currentDocTopics[token] ]++;
			}
			
			double len = 0;
			for (int topic = 0; topic < numTopics; topic++) {
				vector.set(topic, (model.alpha[topic] + topicCounts[topic]) / (docLen + model.alphaSum));
				output.printf("%f ", vector.get(topic));
				len += vector.get(topic)*vector.get(topic);
			}
			CMutator.blockList.get(doc).setVector(vector);
			CMutator.blockList.get(doc).setLen(Math.sqrt(len));
			output.println();
			Arrays.fill(topicCounts, 0);
		}
		
		output.close();
		/*
		Vectors2Topics v2t = new Vectors2Topics();
		String[] args1 = {"Sunday", "Monday", "Tuesday"};
		
		
		model.printDocumentTopics(out1);
		*/
		
	}




}