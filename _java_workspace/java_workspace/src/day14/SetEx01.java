package day14;

import java.util.HashSet; //자동 정렬 안됨
import java.util.Random;
import java.util.Set;
import java.util.TreeSet; //자동 오름차순

public class SetEx01 {

	public static void main(String[] args) {
		// 로또번호 출력 : Set은 중복 안함
		// random으로 생성 1~45까지 총 6개
		int max=45;
		int min=1;
		TreeSet<Integer>set=new TreeSet<Integer>();
		//부모                         자식
		
		//Math 클래스에서 제공하는 random메서드 사용
		//int ran=(int)(Math.random()*max-min+1)*min;
		//Random 클래스 사용하는 방법
		
		
		//set.add(new Random().nextInt(45)+1);
		
		
		while(set.size()<6) { //for문은 못쓴다 중복된게 사라져서
			int r=new Random().nextInt(45)+1;
			set.add(r);
		}

		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.pollFirst());//첫번째꺼 꺼내고 값을 지움
		System.out.println(set);

	}

}

