package day12;

public class 익명클래스 {

	public static void main(String[] args) {
		/* 익명 클래스 : 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 때 클래스 없이 바로 구현
		 * 익명클래스 사용하는 이유
		 * 인터페이스의 기능이 적고, 해당 객체가 하나만 필요한 경우 //다른데서 호출 할 일이 없을 때
		 * 메서드의 매개변수로 주로 사용
		 * */
		
		
		//Tv t= new Tv();
		//product(t);//
		
		//익명클래스로 작업한 경우
		product(new Power() { //구현을 한 객체(=tv)만들어서 매개변수에 안넣고 이렇게한다

			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
			}
			
		}); //파워를 구현한 구현 객체를 매개변수에 넣어줘야 함
		
		
		
	}
	public static void product(Power p) { //파워를 구현한 객체 
		p.turnOn();
		System.out.println("Tv가 작동 중입니다.");
		p.turnOff();
		
	}

}
interface Power{
	void turnOn();
	void turnOff();
}
//class Tv implements Power{
//
//	@Override
//	public void turnOn() {
//		// TODO Auto-generated method stub
//		System.out.println("전원이 켜집니다.");
//		
//	}
//
//	@Override
//	public void turnOff() {
//		// TODO Auto-generated method stub
//		System.out.println("전원이 꺼집니다.");
//	}
//	
//}