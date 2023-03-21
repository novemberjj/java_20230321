package day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class WordManager {
	Scanner scan= new Scanner(System.in);
	private ArrayList<Word> wordList = new ArrayList<Word>();
	
	public void add() {
		wordList.add(new Word("money", "돈"));
		wordList.add(new Word("happy", "행복"));
		wordList.add(new Word("house", "집"));
		wordList.add(new Word("mansion", "저택"));
		wordList.add(new Word("pen", "볼펜"));
	}
	
	public void insertWord() {
		char ch='y';
		while(ch!='n') {
			System.out.println("-- 단어 추가 --");
			System.out.println("단어:");
			String word= scan.next();
			System.out.println("뜻:");
			String mean= scan.next();
			
			wordList.add(new Word(word, mean));
			System.out.println("계속 > y 뒤로가기 > n");
			ch=scan.next().charAt(0);
			
		}
		}
	
	public void printWord() {
		System.out.println("-- 단어 출력 --");
		wordList.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getWord().compareTo(o2.getWord());
			}
		});
		for(int i=0;i<wordList.size();i++) {
			System.out.println(wordList.get(i).toString());;
		}
		System.out.println("-------------");
		
		
		
		//System.out.println(wordList);
		System.out.println();
		
	}
	
	public void searchWord() {
		int index=-1;
		System.out.println("-- 단어 검색 --");
		System.out.println("단어:");
		String word= scan.next();
		for(int i=0;i<wordList.size();i++) {
			if(word.equals(wordList.get(i).getWord())) {
				System.out.println(wordList.get(i));
				index=i;
				return;
			}
		}
		if(index==-1) {
			System.out.println("찾는 단어가 없습니다.");
		}
		
	}
	
	public void deleteWord() {
		int index=-1;
		System.out.println("-- 단어 삭제 --");
		System.out.println("단어:");
		String word= scan.next();
		for(int i=0;i<wordList.size();i++) {
			if(word.equals(wordList.get(i).getWord())) {
				wordList.remove(i);
				System.out.println("삭제 완료");
				index=i;
				return;
			}
		}
		if(index==-1) {
			System.out.println("삭제할 단어가 없습니다.");
		}
		
		
	}
	
	public void updateWord() {
		int index=-1;
		System.out.println("-- 단어 수정 --");
		System.out.println("단어:");
		String word= scan.next();
		for(int i=0;i<wordList.size();i++) {
			if(word.equals(wordList.get(i).getWord())) {
				System.out.println("뜻:");
				String mean= scan.next();
				wordList.get(i).setWord(word);
				wordList.get(i).setMean(mean);
				System.out.println("수정 완료");
				index=i;
				return;
			}
		}
		if(index==-1) {
			System.out.println("수정할 단어가 없습니다.");
		}
		
	}
	public void printToFile() throws IOException {
		System.out.println("-- 파일로 출력 --");
		FileWriter fw = new FileWriter("word.txt");
		
		for(int i=0;i<wordList.size();i++) {
			String data = wordList.get(i)+"\r\n"; 
			fw.write(data);
		}
		fw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("word.txt"));
		while(true) {
			String line= br.readLine();
			if(line==null)break;
			System.out.println(line);
		}
		br.close();
		
	}
	
	

}
