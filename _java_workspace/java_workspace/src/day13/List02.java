package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1.햄버거 : 7000
		 * 2.피자 : 15000
		 * 3.음료 : 2000
		 * 4.과자 : 2000
		 * 5.사탕 : 500
		 * 6.프로그램종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2
		 * =>1번메뉴 햄버거 2개 주문
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴를 선택해주세요. 3, 수량을 선택해주세요. 2
		 *  =>3번메뉴  2개 주문
		 *  주문을 끝내시려면 0을 눌러주세요. 0
		 *  --선택한 메뉴--
		 *  햄버거 2개, 음료 2개 선택 총 금액 :
		 * */

		FoodManager fm = new FoodManager();
		ArrayList<Integer>order = new ArrayList<>();
		fm.add();
		
		Scanner scan= new Scanner(System.in);
		//int menu=-1;
		int menu=0;
		int count=0;
		
		

		
		do {
			fm.printMenu();
			menu= scan.nextInt();
			if(menu<1||menu>6) {
				System.out.println("다시 입력해주세요.");
			}else if(menu==6){
				System.out.println("주문 종료.");
				break;
			}else {
				System.out.println("수량을 입력해주세요.");
				count=scan.nextInt();
				fm.sale(menu, count);
				order.add(menu);
				order.add(count);
				
				
			}
			

		}while(true);
		
		
			System.out.println("--주문확인--");
			for(int i=0;i<order.size();i=i+2) {
				//1 2 3 2
				//int index i+1;
				System.out.print(fm.getFood().get(order.get(i)-1)+" ");
				System.out.println(order.get(i+1)+"개 ");
			}
			fm.total();
			
		
	
		
				
		scan.close();
		
		

	}

}

class FoodManager{ 
	//멤버변수 ArrayList 가격, 메뉴, 그외의 멤버변수 알아서 선언
	private ArrayList<String> food = new ArrayList();
	private ArrayList<Integer> price = new ArrayList();
	private int sum;
	private int totSum;
	
			
	//메서드 정의
	//void printMenu(),추가 메서드 void add(), slae(int menu, int count) 가격 menu*count
	
	public void printMenu() {
		System.out.println("--메뉴판--");
		for(int i=0;i<food.size();i++) {
			System.out.println((i+1)+"."+food.get(i)+":"+price.get(i));
		}
		System.out.println("주문완료 -> 6번");
		System.out.println("메뉴 선택 : ");
		
	}
	
	public void add() {
		food.add("햄버거");
		food.add("피자");
		food.add("음료");
		food.add("과자");
		food.add("사탕");

		price.add(7000);
		price.add(15000);
		price.add(2000);
		price.add(2000);
		price.add(500);
		
	}
	
	public void sale(int menu, int count) {
	System.out.println("주문하신 메뉴는 "+food.get(menu-1)+" "+count+"개 입니다.");
	System.out.println("금액 : "+price.get(menu-1)*count);
		sum=price.get(menu-1)*count;
		totSum+=sum;
		}
	public void total() {
		System.out.println("총 지불하실 금액은 "+totSum+"원 입니다.");
	}
	
	

	public ArrayList<String> getFood() {
		return food;
	}

	public void setFood(ArrayList<String> food) {
		this.food = food;
	}

	public ArrayList<Integer> getPrice() {
		return price;
	}

	public void setPrice(ArrayList<Integer> price) {
		this.price = price;
	}
	
	
	
			
}