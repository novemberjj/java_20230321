package day14;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetEx02 {

	public static void main(String[] args) {
		// 점수들 중 가장 큰 점수와 가장 작은 점수
		
		int[] score= {80,98,75,48,95,62,57,80};
		TreeSet<Integer>set= new TreeSet<Integer>();
		
		for(int i=0;i<score.length;i++) {
			set.add(score[i]);
		}
		System.out.println(set);
		//가장 작은 값 : 가장 앞에 있는 값
		System.out.println("꼴찌"+set.first());
		//가장 큰 값 : 가장 뒤에 있는 
		System.out.println("1등"+set.last());
		
		System.out.println("----------------");
		//headSet : 지정된 객체보다 작은 값 출력,  tailSet : 지정된 객체보다 큰 값 출력
		System.out.println(set.tailSet(80)); //80보다 큰 객체
		System.out.println(set.headSet(80)); //80보다 작은 객체
		
		//범위 검색(70은 포함, 뒷쪽 값은 미포함)
		System.out.println(set.subSet(70, 90)); //70과 90사이의 값
		
		//내림차순 
		NavigableSet<Integer> desSet= set.descendingSet();
		System.out.println(desSet);
		
		

	}

}
