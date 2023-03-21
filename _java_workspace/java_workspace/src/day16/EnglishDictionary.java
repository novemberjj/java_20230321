package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EnglishDictionary {
	public static void main(String[] args) {
		Word w= new Word();
		Scanner scan= new Scanner(System.in);
		
		int menu=0;
		while(menu!=3) {
			System.out.println("==== 메뉴 =====");
			System.out.println("1. 단어 등록");
			System.out.println("2. 단어 출력");
			System.out.println("3. 종료");
			menu=scan.nextInt();
			
			switch(menu) {
			case 1: w.makeWord(); break;
			case 2: w.printWord(); break;
			case 3: break;
			default: System.out.println("메뉴 중에서 선택해주세요.");
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}

class Word{
	//hello : 안녕, 아침인사, 반가움
	private Map<String, ArrayList<String>>words = new HashMap<String, ArrayList<String>>();
	Scanner scan= new Scanner(System.in);
	
	/* y를 입력하면 단어를 입력, n을 입력하면 종료
	 * 단어가 이미 있다면 '이미 있는 단어입니다.' 등록 금지
	 * 메서드명 : makeword, 단어 출력 메서드
	 * */
	

	public Word() {}
	
	public Word(Map<String, ArrayList<String>> words) {
		super();
		this.words = words;
	}
	
	public void makeWord() {
		System.out.println("-- 단어 등록 --");
		char ch = 'y';
		 while (ch != 'n') {
			System.out.println("단어:");
			String word = scan.next();
			for (String tmp : words.keySet()) {
				if (tmp.equals(word)) {
					System.out.println("이미 등록된 단어입니다.");

				}
			}
		
		ArrayList<String> meanList = new ArrayList<String>();
		System.out.println("뜻:");
		scan.nextLine();
		String mean = scan.nextLine();
		meanList.add(mean);
		words.put(word, meanList);

		do {
			System.out.println("다른 뜻 추가 > y 종료 > n");
			ch = scan.next().charAt(0);
			if (ch == 'n') {
				break;
			}
			System.out.println("뜻:");
			scan.nextLine();
			String omean = scan.nextLine();
			meanList.add(omean);

		} while (ch != 'n');

		System.out.println("단어 계속 등록 > y 종료 > n");
		ch = scan.next().charAt(0);
	}

}

	
	
	public void printWord() {
		System.out.println("-- 단어 출력 --");
		for(String s : words.keySet()) {
			System.out.print(s+":");
			System.out.println(words.get(s));
		}
		System.out.println("-------------");
//		Iterator<String> it = words.keySet().iterator();
//		while(it.hasNext()) {
//			String mean=it.next();
//			System.out.println(mean+":"+words.get(mean));
		//}
	}
	
	public Map<String, ArrayList<String>> getWords() {
		return words;
	}

	public void setWords(Map<String, ArrayList<String>> words) {
		this.words = words;
	}
	
	
}
