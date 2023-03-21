package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed 
		 * 메서드 : powerOn(main -sysout 전원 켜짐), powerOff(메서드 -false), speedUp +10, speedDown -10
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 =>getter/setter
		 * */
		
		Car car=new Car("빨강",2);
		System.out.println("--------출고상태-------");
		System.out.println(car.getColor());
		System.out.println(car.getDoor());
		System.out.println(car.getSpeed());
		System.out.println(car.isPower());
		
		car.setColor("green");
		System.out.println("자동차 색깔 : "+car.getColor());
		
		car.powerOn();
	    car.speedUp(); 
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		car.speedDown();
		car.speedDown();
		System.out.println("자동차 속도 : "+car.getSpeed());
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.powerOff();
		
		car.speedUp();
		
		car.powerOn();
		
		car.speedUp();
		car.speedDown();
		car.speedDown();
		
		Car c2 =new Car("노랑");
		System.out.println("----다른 자동차 생성-----");
		System.out.println(c2.getColor());
		System.out.println(c2.getDoor());
		System.out.println(c2.isPower());
		System.out.println(c2.getSpeed());
		
		c2.setColor("빨강");
		System.out.println(c2.getColor());
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		
		
		
		//객체생성없이 불러올려면 static
		//클래스가 다르니까 무조건 객체생성 해줘야함 그러면 static없어도 된다
		
		
		
		
	}
}
	
	class Car{
	//멤버 변수 선언
	private String color="검정";//null
	private int door; //0
	private boolean power; //boolean은 초기값이 false
	private int speed; //0
	
	//생성자 : 없으면 기본생성자가 자동 추가된다.
	//생성자 위치
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int door) {
		//this(color); //생성자 호출 밑에 있으면 에러가 난다
		this.color=color;
		this.door=door;
	}
	
	public Car() {} //기본생성자 생성자가 여러개면 생성자 오버로딩
	
	//멤버 메서드
	public void speedUp() {
		if(power==false) {
			System.out.println("시동을 먼저 켜주세요.");
		}else {
			speed= speed+10;
			System.out.println(color+"속도 : "+speed);
		}
	}
	
	public void speedDown() {
		if(speed<=0) {
			speed=0;
		}else {
		speed=speed-10;
		System.out.println(color+"속도 : "+speed);
		}
		//System.out.println("속도 : "+speed+((speed<=0) ? 0 : speed));
	}

	
	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		power=true;
	}
	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power=false;
	}
	
	
	
	
	
	//getter/setter main에서 쓰려고 만드는 것
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	

	
	
	
	
}
