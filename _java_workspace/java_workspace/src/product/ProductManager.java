package product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements ProductInterface {
	
	private ArrayList<Product> menu = new ArrayList<Product>();
	private ArrayList<Order> order = new ArrayList<Order>();
	
	public void addMenu() {
		menu.add(new Product("햄버거", 15000));
		menu.add(new Product("피자", 20000));
		menu.add(new Product("음료", 2000));
		menu.add(new Product("과자", 2000));
		menu.add(new Product("사탕", 500));
	}
	
	@Override
	public void add(Scanner scan) {
		System.out.println("-- 제품 등록 --");
		System.out.println("메뉴명 >");
		String name=scan.next();
		System.out.println("가격 >");
		int price = scan.nextInt();
		
		menu.add(new Product(name, price));
		
	}

	@Override
	public void printProduct() {
		System.out.println("-- 제품 리스트 --");
		for(int i=0;i<menu.size();i++) {
			menu.get(i).printProduct();
		}
		System.out.println("--------------");
		
	}

	@Override
	public void orerPick(Scanner scan) {
		System.out.println("-- 제품 주문 --");
		System.out.println("메뉴명 > ");
		String name= scan.next();
		System.out.println("수량 > ");
		int count = scan.nextInt();
		for(int i=0;i<menu.size();i++) {
			if(menu.get(i).getName().equals(name)) {
				int price= menu.get(i).getPrice();
				Order order = new Order();
				order.setName(name);
				order.setPrice(price);
				order.setCount(count);
				order.setTotal(price*count);
				this.order.add(order);
			}
		}
		
	}

	@Override
	public void printOrder() {
		int sum=0;
		System.out.println("-- 주문 내역 --");
		for(int i=0;i<order.size();i++) {
			order.get(i).print();
			sum+= order.get(i).getTotal();
		}
		System.out.println("-------------");
		System.out.println("지불 총 금액:"+sum);
		
	}

	@Override
	public void delete(Scanner scan) {
		//메뉴 삭제
		int index=-1;
		System.out.println("-- 제품 삭제 --");
		System.out.println("메뉴명 > ");
		String name= scan.next();
		//menuList에서 menu를 찾아서 remove
		//remove(index), remove(object)
		for(int i=0;i<menu.size();i++) {
			if(menu.get(i).getName().equals(name)) {
				index=i;//메뉴의 위치 추출
				menu.remove(i); //index로 삭제
				//menu.remove(menu.get(i)); //Object로 삭제
				System.out.println("삭제 완료");
				return;
			}
		}
		if(index==-1) {
			System.out.println("제품 목록에 제품이 없습니다.");
		}
		
	}

	@Override
	public void update(Scanner scan) {
		//메뉴 수정
		System.out.println("-- 제품 수정 --"); //가격 수정
		int index=-1;
		System.out.println("메뉴명 > ");
		String name= scan.next();
		System.out.println("가격 >");
		int price= scan.nextInt();
		for(int i=0;i<menu.size();i++) {
			if(menu.get(i).getName().equals(name)) {
				//메뉴의 가격만 수정
				//menu.get(i).setPrice(price); //setName하면 메뉴명도 수정 가능
				Product p = new Product(name, price);
				menu.set(i, p); //객체를 만들어서 수정
				System.out.println("수정 완료");
				index=i;
				return;
			}
		}
			if(index==-1) {
				System.out.println("제품 목록에 제품이 없습니다.");
		}
		
		
	}

	

}
