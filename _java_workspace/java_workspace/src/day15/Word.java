package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Word {//implements Comparable
	private String word;
	private String mean;
	
	Map<String, ArrayList<String>>map = new HashMap<>(); //단어의 뜻을 여러개 두고 싶을 때
	
	public Word() {}
	public Word(String word, String mean) {
		super();
		this.word = word;
		this.mean = mean;
	}

	@Override
	public String toString() {
		return word+":"+mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	//sort할 대상의 값을 수정
//	@Override
//	public int hashCode() {
//		return Objects.hash(mean, word);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Word other = (Word) obj;
//		if(word==null) {
//			if(other.word!=null) {
//				return false;
//			}
//		}else if(! word.equals(other.word)) {
//			return false;
//		}
//		return true;
//	}
//	@Override
//	public int compareTo(Object o) {
//		Word word =(Word)o;
//		// 오름차순
//		return this.word.compareTo(word.word);
		//내림차순
		//return -this.word.compareTo(word.word);
	}
	
	
	
	
	
	

//}
