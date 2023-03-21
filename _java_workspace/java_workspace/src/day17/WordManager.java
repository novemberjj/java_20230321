package day17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day15.Word;

public class WordManager {
	/* package day15에서 생성한 Word클래스 객체화해서 사용
	 * */
	private ArrayList<Word>list = new ArrayList<>();
	
	//기본단어등록
	public void addWord() {
		list.add(new Word("hello", "안녕"));
		list.add(new Word("hi", "안녕"));
		list.add(new Word("apple", "사과"));
		list.add(new Word("orange", "오렌지"));
		list.add(new Word("banana", "바나나"));
	}
	
	
	//단어등록
	public void insertWord(Scanner scan) {
		//Word w = new Word();
		System.out.println("--단어 등록--");
		System.out.println("단어:");
		String word= scan.next();
		System.out.println("뜻:");
		String mean= scan.next();
		
		list.add(new Word(word, mean));
		
//		w.setWord(scan.next());
//		w.setMean(scan.next());
//		list.add(w);
	}
	//단어검색
	public void searchWord(Scanner scan) {
		System.out.println("--단어 검색--");
		System.out.println("단어:");
		String word = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.println("검색결과 > ");
				System.out.println(w);
				return;
			}
		}
		System.out.println("검색 단어가 없습니다.");
		
	}
	//단어수정
	public void modifyWord(Scanner scan) {
		System.out.println("--단어 수정--");
		System.out.println("수정할 단어:");
		String word = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				System.out.println("뜻 수정:");
				String mean= scan.next();
				w.setMean(mean);
				return;
			}
		}
		System.out.println("수정할 단어가 없습니다.");
		
	}
	//단어출력
	public void printword() {
		System.out.println("--단어 출력--");
		list.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				// TODO Auto-generated method stub
				return o1.getWord().compareTo(o2.getWord());
			}

			
		});
		for(Word w : list) {
			System.out.println(w.getWord()+":"+w.getMean());
		}
		
	}
	//단어 파일로 출력
	public void fileWord() throws IOException {
		System.out.println("--파일로 출력--");
		FileWriter fs = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fs);
		
		//단어장의 list의 값을 String화하기위해서 StringBuffer
		//객체 생성
		StringBuffer sb = new StringBuffer();
		String data=null;
		int cnt=0;
		sb.append("단어장");
		sb.append("\r\n"); //줄바꿈
		
		while(cnt<list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); //줄바꿈
			cnt++;
		}
		data=sb.toString();
		System.out.println(data);
		bw.write(data);
		bw.close();
		fs.close();
		
		
		
	}
	//단어 삭제
	public void deleteWord(Scanner scan) {
		System.out.println("--단어 삭제--");
		System.out.println("삭제할 단어:");
		String word = scan.next();
		for(Word w : list) {
			if(w.getWord().equals(word)) {
				list.remove(w);
				System.out.println("삭제 완료");
				return;
			}
		}
		System.out.println("삭제할 단어가 없습니다.");
	}
	//메뉴 출력
	public void printMenu() {
		System.out.println("--단어장 프로그램--");
		System.out.println("1.단어 추가");
		System.out.println("2.단어 검색");
		System.out.println("3.단어 수정");
		System.out.println("4.단어 출력");
		System.out.println("5.파일로 출력");
		System.out.println("6.단어삭제");
		System.out.println("7.종료");
		System.out.println("-------------");
	}

}
