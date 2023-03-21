package day12;

public class 내부클래스 {

	public static void main(String[] args) {
		/* 내부클래스 : 클래스 내부에 선언한 클래스
		 * - 내부 클래스를 포함한 외부 클래스와 밀접한 연관이 있고, 
		 * 다른 외부에서 내부 클래스를 참조할 일이 없을 경우
		 * - 중첩 클래스라고도 함.
		 * - 인스턴스 내부클래스, 정적(static)클래스, 지역(local) 내부 클래스
		 * 익명(anonymous)내부클래스 -> 익명 클래스를 사용하기 위해 내부클래스를 사용
		 * 
		 * - 내부적으로 활용할 목적으로 만드는 클래스이기 때문에 private으로 선언하는 것을 권장
		 * - 내부 클래스 생성시기 : 외부클래스가 생성된 후 생성됨.(static은 다름)
		 * - private이 아닌 내부 클래스는 다른 외부클래스에서 생성할 수 있음
		 * */
		
		Outclass out= new Outclass(); //Inclass도 같이 생성
		System.out.println("----외부 클래스를 이용하여 내부 클래스의 메서드를 호출-------");
		out.usingClass();
		
		System.out.println();
		
		//외부클래스에서 내부클래스를 생성 -> private으로 선언된 내부클래스는 접근 불가
		Outclass.Inclass inClass= out.new Inclass(); 
		System.out.println("-------외부 클래스변수를 이용하여 내부 클래스 생성---------");
		inClass.inClassprint();
		
		System.out.println();
		
		System.out.println("----------정적 내부 클래스의 static메서드 호출-----------");
		//외부클래스에서 바로 정적(static)내부 클래스 생성
		Outclass.InStaticClass.sTest();
		
		System.out.println();
		
		System.out.println("-------정적(static) 내부 클래스의 일반 메서드 호출--------");
		Outclass.InStaticClass sInClass= new Outclass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();

	}

}
class Outclass{
	private int num=10;
	private static int sNum=20;
	private Inclass in;
	public Outclass() {
		in = new Inclass();
	}
	
	//outclass 멤버변수로 추가하는 것과 같은 효과
	class Inclass{ //private 권장사항
		int inNum=100;
		//static int sInNum=200; //안되는 케이스
		void inClassprint() {
			System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
		}
//		static void sTest() { //error
//		}
		
	}//inclass 끝
	public void usingClass() {//inclass 호출하는 outclass의 메서드
		in.inClassprint(); //내부 클래스 변수를 사용하여 메서드를 호출
	}
	
	static class InStaticClass {
		int inNum=1000;
		static int sInNum=2000;
		
		void inTest() { //정적클래스의 일반메서드
			//System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)"); 사용불가능
			System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("Inclass sInNum="+sInNum+"(내부클래스의 static 변수)");
			System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
		}
		
		static void sTest() {//정적클래스의 정적메서드 //static클래스의 static 메서드
			//System.out.println("Outclass Num="+num+"(외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum="+sNum+"(외부클래스의 static 변수)");
			System.out.println("Inclass sInNum="+sInNum+"(내부클래스의 static 변수)");
			//System.out.println("Inclass inNum="+inNum+"(내부클래스의 인스턴스 변수)");
			
		
		}
	}
}//outclass 끝