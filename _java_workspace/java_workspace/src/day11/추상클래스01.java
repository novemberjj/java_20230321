package day11;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 추상클래스 : 미완성 클래스 => 객체를 생성할 수 없다.
		 * 키워드 : abstract
		 * abstract 클래스명 앞/ 메서드 앞에 추가
		 * abstract 리턴타입 메서드명(매개변수);
		 * - 부모클래스에서 상속 받았을 때 특정 메서드가 자식 클래스에서 자주 오버라이딩 될 때
		 * 해당 메서드를 추상 메서드로 작성
		 * - 상속을 받은 클래스에서는 추상메서드가 있다면 반드시 구현해야 한다.
		 * */
		
		Dog g= new Dog("강아지","개과");
		g.printInfo();
		g.howl();
		
		Dog d=new Dog();
		d.name="미미";
		d.category="말티즈";
		d.printInfo();
		d.howl();
		
		//추상클래스는 객체 생성 불가능
//		Cat c= new Cat("고앵이","애옹");
//		c.printInfo();
		//c.howl();

	}

}
//Animal 클래스 = 추상클래스
abstract class Animal{ //추상메서드는 추상 클래스에 있어야함 //추상키워드 필요 //인터페이스는 어차피 추상
	public String name;
	public String category;
	
	
	
	public void printInfo() {
		System.out.println("-------------");
		System.out.println("이름:"+name);
		System.out.println("분류:"+category);
	}
	abstract public void howl();//추상메서드
}
//추상 클래스 Animal을 상속받는 클래스 dog, cat
class Dog extends Animal{//추상클래스를 상속받으면 자식은 반드시 구현해야 함
	
	public Dog() {}
	
	public Dog(String name, String category) {
		super.name=name;
		super.category=category;
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
			System.out.println("울음소리 : 멍멍");
		}
		
	}
//추상 클래스를 상속받는 자식 클래스는 반드시 추상 메서드를 구현해야 함
//자식 클래스가 추상클래스면 구현 안해도 됨.

abstract class Cat extends Animal{
	public Cat() {}
	
	public Cat(String name, String category) {
		super.name=name;
		super.category=category;
	}
}



//class Cat extends Animal{
//	
//	public Cat() {}
//	public Cat(String name, String category) {
//		super.name=name;
//		super.category=category;
//	}

//	@Override
//	public void howl() {
//		// TODO Auto-generated method stub
//		System.out.println("울음소리 : 야옹");
//	}
//	
	
//}

	

	