package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {
 private HashMap<String, Integer>map= new HashMap<>();
 
 int exit=1;
 int sum=0;
 Scanner scan= new Scanner(System.in);
 
	public static void main(String[] args) {
		/* map에 상품명과 가격을 입력받고, 출력
		 * 총 지불 가격 출력
		 * 입력 -> 메서드, 출력 -> 메서드로 구현
		 * */
	MapEx02 ex= new MapEx02();
	
	//1번 형태 멤버변수 형태
	//ex.make1();
	//ex.cost1();

	//2번 형태 메인에서 저장공간 생성
	//HashMap<String, Integer>map = new HashMap<String, Integer>();
	//int size=3;
	//while도 여기서 할 수도 있음
	//ex.make2(map);
	//ex.cost2(map);
	
	//3번 메서드내부에 생성
	//HashMap<String,Integer>map=ex.make3();
	//ex.cost2(map);
	

	}
	//입력 메서드
	public void make1() {
		while(exit!=0) {
			System.out.println("상품명:");
			String name=scan.next();
			System.out.println("가격:");
			int price=scan.nextInt();
			map.put(name, price);
			System.out.println("계속: 1 종료 : 0");
			exit=scan.nextInt();
		}
			
			
		}
	
	public void make2(HashMap<String, Integer>map) {
		while(exit!=0) {
			System.out.println("상품명:");
			String name=scan.next();
			System.out.println("가격:");
			int price=scan.nextInt();
			map.put(name, price);
			System.out.println("계속: 1 종료 : 0");
			exit=scan.nextInt();
		}
//		int size=3;
//		while(map.size()<size) {
//			System.out.println("상품명:");
//			String name=scan.next();
//			System.out.println("가격:");
//			int price=scan.nextInt();
//			map.put(name, price);
		}
	
		
	
	
	public HashMap<String,Integer> make3(){
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		
		while(exit!=0) {
			System.out.println("상품명:");
			String name=scan.next();
			System.out.println("가격:");
			int price=scan.nextInt();
			map.put(name, price);
			System.out.println("계속: 1 종료 : 0");
			exit=scan.nextInt();
		}
		
		return map;
	}
	//출력메서드
	public void cost1() {
		System.out.println("메뉴판 확인");
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			String name=it.next();
			int price = map.get(name);
			System.out.println(name+":"+price);
		}
		for(int tmp: map.values()) {
			sum+=tmp;
		}
		System.out.println("총 지불 금액:"+sum);
	}

	public void cost2(HashMap<String,Integer>map) {
		System.out.println("메뉴판 확인");
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			String name=it.next();
			int price = map.get(name);
			System.out.println(name+":"+price);
		}
		for(int tmp: map.values()) {
			sum+=tmp;
		}
		System.out.println("총 지불 금액:"+sum);
	}
	

	}
	
	



