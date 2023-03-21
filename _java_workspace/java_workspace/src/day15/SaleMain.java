package day15;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		SaleManager sm = new SaleManager();
		sm.addMenu();
		
		int menu=-1;
		do {
			sm.print();
			menu=scan.nextInt();
			
			switch(menu) {

			case 1: sm.add(); break;
			case 2: sm.salePrint(); break;
			case 3: sm.order(); break;
			case 4: sm.orderPrint(); break;
			case 5: sm.update(); break;
			case 6: sm.delete(); break;
			case 7:  break;
			default:
			}
		
		}while(menu!=7);

	}

}
