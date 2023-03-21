package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * */
		
		List<String>list= new ArrayList<String>();
		//ArrayList<String> list = new ArrayList<>();
		
		list.add("밥 먹기");
		list.add("씻기");
		list.add("학원 가기");
		list.add("공부 하기");
		list.add("집에 가기");
		list.add("씻기");
		list.add("밥 먹기");
		list.add("자기");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(String tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		System.out.println("Iterator > ");
		Iterator<String> str= list.iterator();
		while(str.hasNext()) {
			String tmp=str.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Test());
		System.out.println(list);

	}

}
class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// compareTo 메서드 활용
		return o2.compareTo(o1);//자리 바꾸면 오름차순 내림차순
	}
	
}