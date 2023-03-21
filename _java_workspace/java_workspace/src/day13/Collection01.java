package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열대신 사용
		 * 
		 * List : 배열과 동일
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복을 허용
		 * - 배열 대신 가장 많이 사용 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장X (index)번지가 없음.
		 * - 중복 X
		 * Map
		 * - 값을 두 개 저장, key/value 쌍으로 저장
		 * - key는 중복 불가, value는 중복 가능
		 * - key가 중복되면 덮어쓰기 됨.
		 * - 아이디 / 패스워드처럼 같이 묶어서 하나의 자료로 저장해야 할 때 사용
		 * 
		 * int arr[]; : 기본 자료형 사용가능.
		 * collection에서는 어떤 클래스로 데이터를 관리할지 지정해야 함.
		 * 
		 * int//쓸 수 없다 -> Integer, String, 나머지 자료형들은 첫글자만 대문자로 변형 Byte, Boolean..
		 * 클래스를 지정하지 않으면 Object가 자동 들어간다.
		 * */
		
		//List list1= new List()//error
		List list1= new ArrayList(); //import 시켜줘야함 //Object클래스가 자동지정된 케이스
		ArrayList list2= new ArrayList(); // Object클래스가 자동 지정된 케이스 //숫자 문자 둘다 가능
		//숫자만 가능한 ArrayList 생성
		ArrayList<Integer> list= new ArrayList<Integer>();
		//문자열만 가능한 ArrayList 생성
		ArrayList<String>list3= new ArrayList<String>(); //<>클래스명
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.toString());
		
		//size() : list의 총 개수
		System.out.println(list.size());
		//list3에 문자 5개 지정 후 출력, 총 개수 출력
		list3.add("apple");
		list3.add("banana");
		list3.add("caramel");
		list3.add("ditto");
		list3.add("elephant");
		System.out.println(list3);
		System.out.println(list3.size());
		
		//리스트를 생성하고 1~10까지 저장한 후 출력
		ArrayList<Integer>list4=new ArrayList<Integer>();
		//List는 인터페이스 
		//List<Integer> list4= new ArrayList<>(); 보통 이렇게 쓴다 인티저는 한번만 쓰면 됨
		for(int i=1;i<=10;i++) {
			list4.add(i);
		}
		System.out.println(list4);
//		int size=10;
//		for(int i=0;i<size;i++) {
//			list4.add(i+1);
//		}
		//한 번 더 돌리면 쭉 추가 됨 덮어쓰는 거 아님 //번지 없음
		
		//get(index) : index번지의 값을 가져와라
		System.out.println(list4.get(0));
		
		//set(index,값) : index번지의 내용을 값으로 변경
		list4.set(0, 5);
		System.out.println(list4.get(0));
		
		//remove(index) : index 번지값 삭제
		//remove(Object) : object값으로 넣으면 값으로 삭제
		list4.remove(1); //1번지 삭제
		System.out.println(list4);
		Integer a = 10;
		list4.remove(a);
		System.out.println(list4);
		
		//contains(Object) : list에 값이 있는지 검사 있으면 true/없으면 false
		System.out.println(list4.contains(a));
		
		//clear() : list 삭제 (비움)
		list4.clear();
		System.out.println(list4);
		
		//isEmpty() : list가 비었는지 체크 비어있으면 true
		System.out.println(list4.isEmpty());
		
		//list4에 for문으로 1~5까지만 입력
		for(int i=5;i>0;i--) {
			list4.add(i);
		}
		
		//list4요소 출력
		for(int i=0;i<list4.size();i++) {
			System.out.print(list4.get(i)+" ");
		}
		System.out.println();
		System.out.println("--------------------");
		
		//요즘 자주사용 : 향상된 for문
		for(int tmp : list4) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		//Iteraotr : 컬렉션을 출력하기 위해 사용.
		/* list는 순서를 보장하기 때문에 get(i)을 이용하여 원하는 번지에 접근 가능
		 * set은 순서를 보장하지 않기 때문에 for문을 이용할 수 없음
		 * 향상된 for, Iterator 처럼 순서와 상관없이 값을 가져올 수 있는 구문에서 출력가능
		 * 
		 * */
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list4.iterator();
		//인터페이스
		while(it.hasNext()) {//has next (있냐)다음 요소가 있는지 체크 true / false
			Integer tmp = it.next(); //next(가져와)다음 요소 가져오기
			System.out.print(tmp+" "); //출력
		}
		System.out.println();
		System.out.println("------------------");
		
		//indexof(값) : 해당 값의 list index번지를 반환 /없다면 -1리턴 
		Integer b = 5;
		System.out.println(list4.indexOf(b));
		
		//Collections.sort(list4); //오름차순 정렬만 가능
		System.out.println(list4);
		
		//sort(객체)
		//- 객체 : Comparator 인터페이스를 구현한 객체를 넣어야함. (익명클래스를 사용)
		//- 비교(compare) 메서드를 사용하여 객체를 정렬
		//내림차순 / 오름차순순
		list4.sort(new Comparator<Integer>() { //익명클래스

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 :오름차순, o2-o1:내림차순
				return o1-o2; //문자는 compareTo 
			}
		});
		System.out.println(list4);
	}

}
