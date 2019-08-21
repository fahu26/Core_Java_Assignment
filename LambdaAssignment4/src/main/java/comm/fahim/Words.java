package comm.fahim;

public class Words {
private String word;
private int length;
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public Words(String word, int length) {
	super();
	this.word = word;
	this.length = length;
}
@Override
public String toString() {
	return "Words [word=" + word + ", length=" + length + "]";
}

}
