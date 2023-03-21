package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 단어장 단어:의미 => hello : 안녕
		 * 
		 * 5개의 단어를 입력하고, 단어장을 출력
		 * */
		
		HashMap<String,String>map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		//int cnt=0;
		int size=5; //사이즈를 먼저 지정
		//String arr[]=new String[5]; //5개의 값을 받기
		
		//while을 이용하여 단어와 뜻 입력받고 map에 저장
		while(map.size()<size) {
			//입력
			System.out.println("단어:");
			String word=scan.next();
			System.out.println("뜻:");
			String mean=scan.next();
			
			map.put(word, mean); //map.size() 증가
		}
		
		//출력
		Iterator it = map.keySet().iterator(); //iterator import 잘 보고 하기
		while(it.hasNext()) {
			String word= (String)it.next(); //Iterator<>에 자료형 안쓰면 기본 object//안적으면 it.next()는 object String과 자료형이 맞지 않음 //key값 반환
			String mean=map.get(word); //value값 반환
			System.out.println("단어:"+word+" 의미:"+mean);
		}
		
		
//		while(cnt!=5) {
//			System.out.println("단어와 의미를 입력해주세요.");
//			map.put(scan.next(), scan.next());
//			cnt++;
//		}
//		
//		System.out.println("단어장 출력 > ");
//		for(String tmp : map.keySet()) {
//			System.out.println(tmp+":"+map.get(tmp));
//		}
		
		scan.close();

	}

}
