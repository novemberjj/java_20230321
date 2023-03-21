package day10;

public class 클래스06 {
	public static void main(String[] args) {
		/* final은 클래스, 변수, 메서드에 붙일 수 있음.
		 * final : 수정할 수 없다. 
		 * final 멤버 변수 : 상수
		 * final 멤버 메서드 : 오버라이딩을 할 수 없음.
		 * final 클래스 : 상속할 수 없다. 부모 클래스가 될 수 없다.
		 * */
		EzenStudent s= new EzenStudent();
		
		System.out.println(s);
		//setter을 이용한 객체 생성
		s.setBan("자바 웹 개발자");
		s.setChain("인천");
		s.setName("홍길동");
		s.setNum("010-1234-5678");
		
		s.print();
		
		System.out.println(s);
		
		//생성자를 이용한 객체 생성
		EzenStudent s2= new EzenStudent("인천","ㅇㅇㅇ","aws","010 0212 4565");
		System.out.println(s2);
		s2.print();
		
		
	}

}
/* 초기화 방법 : 기본값, 명시적 초기값(선언과 동시에 값을 줌), 초기화 블럭, 생성자
 * 1. 명시적 초기화 : 멤버변수 선언과 동시에 초기값을 지정
 * 2. 초기화 블럭 : { } 멤버변수 초기화
 * 3. 생성자 : 객체를 생성할 때 초기화해서 생성
 * 기본값 -> 명시적초기값 -> 초기화블럭 -> 생성자 
 * 초기값 우선순위 생성자가 가장 높다
 * 명시적 초기값이 있어도 초기화블럭에 두 번 초기화 됨 //초기화블럭이 더 우선순위
 * */

//멤버변수 : 지점, 이름, 반, 전화번호
//메서드 : 출력(print 메서드, toString 가능)
class EzenStudent{
	
	private String chain="인천"; //final 수정 못함 static 다쓰고싶어? //명시적 초기값
	private String name;
	private String ban;
	private String num; //전화번호는 int로 선언하지 않는다. 0으로 시작하는 숫자는 8진수로 변환됨
	//연산될때만 int 사용. Ex) 숫자가 바뀔때
	{
		//초기화 블럭 : 멤버변수들을 초기화;
		ban="미정";
	}
	
	//생성자 클래스명과 동일
	public EzenStudent() {}
	
	//constructor using field
	public EzenStudent(String chain, String name, String ban, String num) {
		super();
		this.chain = chain;
		this.name = name;
		this.ban = ban;
		this.num = num;
	}
	
	public void print() {
		System.out.println("지점:"+chain);
		System.out.println("반:"+ban);
		System.out.println("이름:"+name);
		System.out.println("번호:"+num);
	}

	@Override
	public String toString() {
		return "EzenStudent [chain=" + chain + ", name=" + name + ", ban=" + ban + ", num=" + num + "]";
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	
	
	
	
	
}