package re;

import java.util.ArrayList;
import java.util.List;

public class StreamEx03 {

	public static void main(String[] args) {
		List<Student>stdList= new ArrayList<>();
		stdList.add(new Student("홍길동",90));
		stdList.add(new Student("홍길순",80));
		stdList.add(new Student("강길동",60));
		stdList.add(new Student("강길순",50));
		stdList.add(new Student("이길동",70));
		
		//class에 toString이 존재하면
		//stdList.stream().forEach(System.out::println);
		//{} : 처리구문이 많은경우
		stdList.forEach(s->{
			String name= s.getName();
			int score = s.getScore();
			System.out.println(name+":"+score);
		});
		
		//합계 => intStream
		//getScore() => Integer => int 변환
		//추출 =>map, 추출 후 int변환 => mapToInt
		int sum= stdList.stream().mapToInt(s->s.getScore()).sum();
		//System.out.println(sum);
		
		//개수
		long cnt = stdList.stream().count();
		System.out.println("합계:"+sum+"총 인원:"+cnt);
		
		//점수가 70점이상인 친구들의 합계
		int upSum= stdList.stream().mapToInt(a->a.getScore()).filter(a->a>=70).sum();
		System.out.println("점수가 70점이상인 친구들의 합계:"+upSum);

	}

}
class Student{
	private String name;
	private int score;
	
	public Student() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	
	
}
