package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class LiList {

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
		
		FoodManager1 fm= new FoodManager1();
		ArrayList<Integer>order = new ArrayList<Integer>();
		//1번 메뉴 3개 3번 메뉴 3개 -> 1 3 / 3 3
		fm.add();
		Scanner scan=new Scanner(System.in);
		int menu=-1;
		do {
			fm.printMenu(); //메뉴출력
			menu=scan.nextInt(); //메뉴입력받기
			//1~5까지는 일반메뉴, 6프로그램 종료 0메뉴선택끝
			if(menu==6) {
				System.out.println("프로그램 종료");
				break;
			}
			if(menu!=0) {
				if(menu<6) {
					System.out.println("수량 : ");
					int count=scan.nextInt();
					fm.sale(menu, count);
					order.add(menu);
					order.add(count);
					System.out.println("주문 종료 => 0번");
				}else {
					System.out.println("잘못된 메뉴");
				}
			}
		}while(menu!=0);
		//햄버거 2개 음료 2개 총금액?
		System.out.println("주문확인");
		for(int i=0;i<order.size();i++) {
			System.out.print(fm.getList1().get(order.get(i)-1)+" ");
			System.out.println(order.get(i+1)+"개 ");
		}
		System.out.println();
		System.out.println("계산히실 금액은"+fm.getTotSum()+"입니다.");
		
		scan.close();

	}

}
class FoodManager1{
	//멤버변수 ArrayList 가격, 메뉴, 그 외의 멤버변수 알아서 선언
	//메뉴에 대한 List
	private ArrayList<String> list1 = new ArrayList();//메뉴
	private ArrayList<Integer> list2= new ArrayList();//가격
	private int sum;
	private int totSum;
	
	public void add() {
		//list에 값 추가
		list1.add("햄버거"); //0 -> 1번메뉴
		list1.add("피자");
		list1.add("음료");
		list1.add("과자");
		list1.add("사탕");
		
		list2.add(7000);
		list2.add(15000);
		list2.add(2000);
		list2.add(2000);
		list2.add(500);
	}
	
	public void printMenu() {
		System.out.println("--메뉴--");
		
	}
	
	public void sale(int menu, int count) {
		//list2.get(menu-1) : 메뉴에 대한 가격
		sum=list2.get(menu-1)*count;
		totSum=+sum;
		System.out.println("---------------------");
		System.out.println("주문하신 메뉴는 "+list1.get(menu-1)+" "+count+"개 입니다.");
		System.out.println("금액 : "+sum);
	}

	public ArrayList<String> getList1() {
		return list1;
	}

	public void setList1(ArrayList<String> list1) {
		this.list1 = list1;
	}

	public ArrayList<Integer> getList2() {
		return list2;
	}

	public void setList2(ArrayList<Integer> list2) {
		this.list2 = list2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotSum() {
		return totSum;
	}

	public void setTotSum(int totSum) {
		this.totSum = totSum;
	}
	
	
	
}