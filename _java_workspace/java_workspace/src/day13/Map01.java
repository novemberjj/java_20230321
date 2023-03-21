package day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 저장, key / value 값으로 저장
		 * - key는 중복불가, value는 중복가능.
		 * - HashMap을 저장 많이 사용
		 * 
		 * HashMap<String, Integer>map = new HashMap<String, Integer>(); //뒤에 <>은 생략가능
		 * Map은 값이 2개여서 Iterator를 사용할 수 없음 
		 * Map=>Set으로 변경 후 출력
		 * 
		 * list, set -> .add(); //추가 .get(index);//추출
		 * map => .put(); //추가
		 * getKey(), getValue(); //추출
		 * */
		HashMap<String, Integer>map = new HashMap<String, Integer>();
		map.put("햄버거", 15000);
		map.put("피자", 20000);
		map.put("음료", 2000);
		map.put("과자", 2000);//value는 중복되도 상관 없음
		map.put("사탕", 500);
		//map.put("사탕", 700); key가 중복되면 앞쪽이 사라짐
		
		System.out.println(map);//순서 없음
		System.out.println(map.keySet());//key값 따로 추출
		System.out.println(map.values());//value값 따로 추출
		//key=햄버거인 값을 출력
		System.out.println(map.get("햄버거")); //get(key)->return value //값(Object)으로 객체를 가져와야 함
		
		
		System.out.println("--iterator 출력");
		Iterator<String> it=map.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println("--향상된 For문 이용");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}
		System.out.println(map);//중괄호 ->두 가지의 값을 구성하고 있는 map key별도 value별도
		System.out.println(map.entrySet());//대괄호 -> key value는 하나의 값
		
		System.out.println("--entrySet 이용");
		for(Map.Entry<String, Integer> tmp: map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
		
		int sum=0;
//		for(int tmp : map.values()) {
//			sum+=tmp;
//		}
//		System.out.println(sum);
		for(String tmp : map.keySet()) {
			sum+=map.get(tmp);
		}
		System.out.println(sum);
		

	}

}
