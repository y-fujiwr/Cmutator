package jp.ac.osaka_u.ist.sel.clonedetector.data;

public class ClonePair {
	public final Block cloneA;
	public final Block cloneB;
	public final double sim;
//	public boolean check = false;
//	public int set;
	public ClonePair(Block cloneA, Block cloneB, double sim) {
		this.cloneA = cloneA;
		this.cloneB = cloneB;
		this.sim = sim;
	}
}
