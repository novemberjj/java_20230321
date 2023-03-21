package day10;

import java.util.Scanner;

public class Product_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product1[] p = new Product1[10];
		Scanner scan = new Scanner(System.in);
		
		char menu='y';
		int cnt=0; //p객체의 index 핸들링
		int sum=0;
		
		while(menu !='n') {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			menu=scan.next().charAt(0);
			
			if(menu=='y') {
				System.out.println("상품명 > ");
				String name= scan.next();
				
				System.out.println("가격 > ");
				int price=scan.nextInt();
				//sum=sum+price;
				
				//생성자를 이용하여 객체 생성 후 배열에 객체 담기
//				Product1 tmp= new Product1(name,price);
//				p[cnt]=tmp;
				
				//insertProduct 메서드를 활용하여 객체 생성 후 등록
				p[cnt] = new Product1();
				p[cnt].inserProduct1(name, price);
				
				cnt++; //index 증가	
			}else {
				if(menu=='n') {
					System.out.println("상품 등록 종료");
				}else {
				System.out.println("y/n만 입력가능합니다.");
			}
		}
		}
		
		System.out.println("---------등록된 제품 리스트---------");
		for(int i=0;i<cnt;i++) {
			//toString 있어서 가능
			System.out.println((i+1)+"번째 상품 : "+p[i]);
			//메서드 사용한 경우
			//p[i].출력 메서드명
			sum=sum+p[i].getPrice();
		}
		System.out.println(cnt+"개의 상품 총 합계:"+sum+"원");
		
		
		
		
		scan.close();

	}

}

class Product1 {
	
	private String name;
	private int price;
	
	public Product1() {}
	
	public Product1(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	//삽입메서드
	public void inserProduct1(String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", price=" + price + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
