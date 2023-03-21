package product;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		int menu=0;
		Scanner scan= new Scanner(System.in);
		ProductManager pm= new ProductManager();
		pm.addMenu();
		
		while(menu!=7) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 제품 등록");
			System.out.println("2. 제품 리스트");
			System.out.println("3. 제품 주문");
			System.out.println("4. 주문 내역");
			System.out.println("5. 제품 수정");
			System.out.println("6. 제품 삭제");
			System.out.println("7. 종료");
			System.out.println("입력 >");
			menu=scan.nextInt();
			
			switch(menu) {

			case 1: pm.add(scan); break;
			case 2: pm.printProduct(); break;
			case 3: pm.orerPick(scan); break;
			case 4: pm.printOrder(); break;
			case 5: pm.update(scan); break;
			case 6: pm.delete(scan); break;
			case 7:  break;
			default:
			}
			
		}
		System.out.println("프로그램 종료");
		
		scan.close();
	}

	}


