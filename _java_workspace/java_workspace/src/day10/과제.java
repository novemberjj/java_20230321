package day10;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* Product 클래스 : 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 등록 메서드 = insertProduct
		 * 출력메서드 toString
		 * getter/setter
		 * */
		
		/* ProductMain
		 * product 배열 생성 [10]
		 * 
		 * 상품 등록 후 리스트 출력
		 * 
		 * 스캐너를 통해서 상품 등록
		 * 상품을 등록하시겠습니까?(y/n)
		 * y => 상품등록 /n=>그만
		 * 상품이름과 가격을 등록받아 상품 배열에 등록
		 * 
		 * n=>등록된 제품 리스트 출력
		 * */
		
//		Product a= new Product("핸드폰","백만원");
//		System.out.println(a);
		
		Scanner scan= new Scanner(System.in);
		
		Product[] md= new Product[10];
		int i=0;
		int sum=0;
		
		
		
		while(true) {
			System.out.println("상품을 등록하시겠습니까?");			
			char ch=scan.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				System.out.println("상품의 이름과 가격을 입력해주세요.");
				String str=scan.next();
				String str2=scan.next();
				Product a= new Product();
				a.inserProduct(str,str2);
				md[i]=a;
				i++;
			}else if(ch=='n'||ch=='N') {
					System.out.println("등록을 종료합니다.");
						break;
			}
			if(i==10) {
				System.out.println("등록완료");
				break;
			}
		}
	
		for(int j=0;j<i;j++) { //null안나오게 하고 싶을 때
			System.out.println(md[j]);
			int num=Integer.parseInt(md[j].getPrice());
			sum=sum+num;		
	}
	System.out.println("합계:"+sum);
		
		scan.close();
		
	}	
	}


class Product{
	private String name;
	private String price;
	
	public Product() {};
	
	public Product(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void inserProduct(String name, String price) {
		this.name=name;
		this.price=price;
	}

	@Override
	public String toString() {
		return "상품 [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
	
	
	
	
}
