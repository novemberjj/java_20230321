package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx03 {

	public static void main(String[] args) {
		List<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student("홍길동", 90));
		stdList.add(new Student("홍길순", 76));
		stdList.add(new Student("강감찬", 87));
		stdList.add(new Student("강길동", 46));
		stdList.add(new Student("강길순", 67));
		
		//Student class에 toString이 있으면 그냥 찍으면 된다
		stdList.stream().forEach(a->System.out.println(a.getName()+":"+a.getScore()));;
		System.out.println("-----------");
		//{} : 처리구문이 많은 경우
		stdList.stream().forEach(s->{ //s => new Student("홍길동",90) 하나의 객체다
			String name= s.getName();
			int score = s.getScore();
			System.out.println(name+":"+score);
		});
		
		//합계 => intStream
		//getScore() => Integer => int변환
		//추출 => map, 추출 후 int 변환 => mapToInt
		int sum=stdList.stream().mapToInt(a->a.getScore()).sum();
		System.out.println("합계:"+sum);
		
		//개수
		long cnt=stdList.stream().count();
		System.out.println("인원:"+cnt);
		
		//점수가 70점 이상인 친구들의 합계
		int upSum=stdList.stream().filter(a->a.getScore()>=70).mapToInt(n->n.getScore()).sum();
		System.out.println("70점 이상인 친구들의 합계:"+upSum);
		
		
		

	}

}
