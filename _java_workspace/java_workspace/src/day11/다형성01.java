package day11;

public class 다형성01 {

	public static void main(String[] args) {
		/* 모든 클래스의 최고 조상은 Object 클래스
		 * 모든 클래스는 Object가 제공하는 클래스를 사용할 수 있고,
		 * 오버라이딩 할 수 있다.
		 * 
		 * 상속은 단일상속이 원칙!!
		 * 부모는 1명, 부모가 2개가 될 수는 없다.
		 * 
		 * 
		 * */
		A a= new A();
		a.num=10;
		System.out.println(a);
		
		A b= new B(); //A클래스 기반 B클래스 객체화 B a = new A();는 안됨
		b.num=20;
		//b.num=10; //private아니라 직접 접근 가능
		System.out.println(b);
		

	}

}
class A{
	int num;

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
	
	
}
class B extends A{ //상속은 오직 단일 상속 
	
	
}
class C{
	int num;
}
