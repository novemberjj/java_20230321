package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx01 {
	//멤버변수 자리
	//1번 형태
	private HashMap<String, String>map = new HashMap<>();
	Scanner scan= new Scanner(System.in); //스캔이 멤버변수가 됨 모든데서 사용 가능 //static에서 쓸려면 static 붙여줘야 함 
	private int size=5; //생성할때 생성자로 값을 받는게 좋긴함 변수 선언과 동시에 값 지정 잘 안함 
	
	//메서드 자리
	public static void main(String[] args) {
		/* 단어장 -> 메서드로 변경
		 * 단어를 입력받는 메서드 생성
		 * 단어를 저장할 공간을 어디에서 만들까 결정
		 **/ 
		 //1. 저장 공간을 어디에다가 둘 지
		 	//- 1. 멤버변수 => 공용변수로 있는 형태
		 	//- 2. main (별로 안좋음) -> 외부메서드에서 매개변수로 받는 형태 => 매개변수로 받는 형태
		 	//- 3. 메서드내부에 생성 -> 리턴의 형태
		 //2. 매개변수와 리턴타입, 메서드명을 결정 => interface 생성
		
		MapEx01 ex = new MapEx01(); //객체가 있어야 함 
		//map이 static이 아닌 인스턴스변수(메서드)라서 객체를 반드시 생성해야지만 접근가능.
		
		//1번 형태 멤버변수 형태
		//ex.make();
		//멤버변수 출력 형태
//		Iterator<String> it= ex.map.keySet().iterator(); //타 클래스의 경우 get으로 접근
//		while(it.hasNext()) {
//			String word= it.next();
//			String mean= ex.map.get(word);
//			System.out.println("단어:"+word+"의미:"+mean);
		
		//2번 형태
//		HashMap<String, String>map = new HashMap<>();
//		ex.make2(map);
//		Iterator<String> it= map.keySet().iterator();
//		while(it.hasNext()) {
//			String word= it.next();
//			String mean= map.get(word);
//			System.out.println("단어:"+word+"의미:"+mean);
		
		//3번 형태
		//make3(); static이 없어서 안됨
		HashMap<String, String>map= ex.make3(); //new HashMap<String, String>(); <- make3를 그대로 받음
		
		//출력
		Iterator<String> it= map.keySet().iterator();
		while(it.hasNext()) {
			String word= it.next();
			String mean= map.get(word);
			System.out.println("단어:"+word+"의미:"+mean);
			
		}
		

	}
	//메서드 자리 : 리턴타입, 매개변수, 메서드명을 결정
	//1. 멤버변수로 map이 있는 형태 (공용) 리턴X, 받을 것도 없음(매개변수)
	public void make() {
		while(map.size()<size) { //파란색 멤버변수
			System.out.println("단어:");
			String word=scan.next();
			System.out.println("의미:");
			String mean=scan.next();
			
			map.put(word, mean);
		}
	}
	
	//2. 외부에 map이 있는 형태 (매개변수로 map을 가져오기)
	public void make2(HashMap<String,String> map) { //갈색 외부에서 들어오는 매개변수
		while(map.size()<size) { //파란색 멤버변수
			System.out.println("단어:");
			String word=scan.next();
			System.out.println("의미:");
			String mean=scan.next();
			
			map.put(word, mean);
	}
	}
	
	//3. 메서드 내부에서 map 생성하는 형태 (리턴이 map인 형태)
	public HashMap<String, String> make3() {
		HashMap<String, String>map = new HashMap<String, String>();
		while(map.size()<size) { //파란색 멤버변수
			System.out.println("단어:");
			String word=scan.next();
			System.out.println("의미:");
			String mean=scan.next();
			
			map.put(word, mean);
		}
		return map;
		
	}
	public HashMap<String, String> getMap() {
		return map;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
