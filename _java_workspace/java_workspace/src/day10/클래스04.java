package day10;

public class 클래스04 {

	public static void main(String[] args) {
		// Car클래스의 객체를 생성할 메인
		
		Car c= new Car();
		c.print();
		c.setAirback(true);
		c.setColor("green");
		c.setDoor(4);
		c.print();
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		c.speedUp();
		
		Car nc = new Car("노랑", 2, false);
		nc.print();
		System.out.println(nc);
		
		

	}

}

class Car{
	//멤버변수 : color, door, airback, power, speed
	private String color;
	private int door;
	private int speed;
	private boolean power;
	private boolean airback;
	
	//생성자 : 빈생성자, color, (color,door), (color, door, airbakck),전체 생성자 
	public Car() {}//기본생성자
	
	public Car(String color) { //set이랑 같은 의미 생성할때 셋팅
		//this 멤버변수를 의미
		//멤버변수와 매개변수의 이름이 같을 경우 멤버변수라는 것을 표시하기 위해 사용
		this.color=color;
	}
	
	public Car(String color, int door) {
		this.color=color;
		this.door=door;
		
	}
	public Car(String color, int door,boolean airback) {
		//생성자 호출 전체삽입만 가능 하나라도 제외되면 안된다
		this(color,door);
		this.airback=airback;
		
	}
	//생성자 자동생성 constructor using field
	public Car(String color, int door, int speed, boolean power, boolean airback) {
		//super(); //부모의 생성자를 호출
		this.color = color;
		this.door = door;
		this.speed = speed;
		this.power = power;
		this.airback = airback;
	}
	
	//method : print, powerOn, powerOff,speedUp, speedDown
	public void print() {//멤버변수를 출력할거라 받을 거 없음 멤버변수는 매개변수로 받을 필요 없음
		//멤버변수는 내클래스에서 모든 메서드에서 공유되는 변수
		//멤버변수를 매개변수로 받을 필요가 없음.
		System.out.println("------My Car------");
		System.out.println("color : "+color);
		System.out.println("door : "+door);
		System.out.println("airback : "+airback);
		System.out.println("------------------");
	}
	
	//toString : 멤버변수들을 출력해주는 메서드 generate toString
	@Override
	public String toString() {
		return "MyCar [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	}
	
	

	public void powerOn() {
		System.out.println("시동이 켜졌습니다.");
		power=true;
	}

	public void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
		power=false;
	}
	public void speedUp() {
		if(power==false) {
			System.out.println("시동을 먼저 켜주세요.");
		}else {
			speed=speed+10;
			System.out.println("speed "+speed);
		}
	}
	public void speedDown() {
		if(speed<=0) {
			speed=0;
		}else {
			speed=speed-10;
			System.out.println("speed : "+speed);
		}
	}
	
	
	
	
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}

	public boolean isAirback() {
		return airback;
	}

	public void setAirback(boolean airback) {
		this.airback = airback;
	}
	
	
	
	
	
}