package day08;

public class 클래스03 {

	public static void main(String[] args) {
		/* Card 클래스 생성
		 * */
		
		Card c=new Card();
		
		c.print();
		
		c.setShape('♠');
		c.setNum(5);
		c.print();
		
		//카드에 있지 않는 모양/숫자가 들어오면 무조건 1♥
		c.setNum(-2);
		c.setShape('$');
		c.print();
		
		
		
		
	}

}

/* Card클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트♥, 클로버♣, 다이아◆, 스페이드♠
 * 숫자 : 1~10  J K Q(11~13)
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape, int num
 * - 메서드 : print(♥1)
 * - 생성자 : 하트1이 초기값(♥1)
 * - getter/setter
 * 
 *  생성자 선언 방법
 *  public 클래스명(){ //매개변수는(필요하면 생성) 없을 수도 있음
 *  초기값;
 *  }
 * */

class Card{
	private char shape;//모양 //상수가 아닌이상 멤버변수에서 초기값 넣지 않음 일반적으로 생성자에서 만든다
	private int num;
	
	//생성자 : 객체의 초기값을 결정
	public Card() {
		shape='♥'; //매개변수가 없기때문에 this안붙임 매개변수와 멤버변수와 이름이 같은 경우
		num=1;
	}
	//print 메서드
	//shpae,num을 출력하는 메서드
	public void print() {
		switch(num) {
		
		case 11: 
			System.out.print("J");
			break;
		case 12: 
			System.out.print("K");
			break;
		case 13:
			System.out.print("Q");
		break;
		default:
			System.out.print(num);
		}
		System.out.println(shape); //(shape+num) 11♥ => J♥
	}
	
	public Card(char shpae,int num) {
		this.shape=shape;
		this.num=num;
	}

	
	
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		if(shape!='♥'||shape!='♣'||shape!='◆'||shape!='♠') {
			this.shape='♥';
		}else {
		this.shape = shape;
		}
		
//		//switch(shape) {
//		case '♥': case '♣': case '◆': case '♠':
//			this.shape=shape;
//			break;
//			default:
//				this.shape='♥'
		//}
		
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num<1||num>13) {
			this.num=1;
		}else {
		this.num = num;
		}
	}
	
	
	
	
	
	
}