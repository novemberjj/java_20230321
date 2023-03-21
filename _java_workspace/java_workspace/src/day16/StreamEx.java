package day16;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		/* 문자열(이름)을 담는 리스트 생성 후, 스트림으로 생성
		 * 정렬하여 출력 forEach sysout
		 * */
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("kim");
		list.add("hong");
		list.add("tomas");
		list.add("edward");
		list.add("jack");
		list.add("park");
		list.add("lee");
		
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("--스트림 객체 생성 후 출력--");
		Stream<String> st = list.stream();
		st.sorted().forEach(s->System.out.println(s));
		
		//글자수가 5글자 이상인 이름만 출력
		System.out.println("--글자 수 5자 이상--");
		list.stream().filter(n->n.length()>=5).forEach(System.out::println); //변수 안받고 메서드로 바로 출력
		
		//각자 이름의 글자수를 출력
		System.out.println("--각자 이름의 글자수를 출력--");
		list.stream().map(n->n.length()).forEach(System.out::println); //map 추출
		

	}

}
