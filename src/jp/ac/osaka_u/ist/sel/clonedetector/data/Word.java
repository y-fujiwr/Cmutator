package jp.ac.osaka_u.ist.sel.clonedetector.data;

public class Word {

	private String name;
	private int type;
	private double count;
	public static final int WORD = 0;
	public static final int STATEMENT = 1;

	/**
	 * <p>
	 * コンストラクタ
	 * </p>
	 * 
	 * @param word
	 */
	public Word(String name, int type, double count) {
		this.name = name;
		this.type = type;
		this.count = count;
	}

	/**
	 * <p>
	 * 単語名取得
	 * </p>
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>
	 * 単語名設定
	 * </p>
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>
	 * カウント値取得
	 * </p>
	 * 
	 * @return
	 */
	public double getCount() {
		return count;
	}

	/**
	 * <P>
	 * カウント
	 * </p>
	 */
	public void addCount(double c) {
		count += c;
	}

	/**
	 * <p>
	 * ワードタイプの取得
	 * <p>
	 * 
	 * @return
	 */
	public int getType() {
		return type;
	}

	/**
	 * <p>
	 * ワードタイプの設定
	 * <p>
	 * 
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

}
