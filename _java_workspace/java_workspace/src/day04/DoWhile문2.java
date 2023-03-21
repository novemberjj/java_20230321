package day04;

import java.util.Scanner;

public class DoWhile문2 {

	public static void main(String[] args) {
		/* -----------menu-----------
		 * 1.저장|2.출력|3.종료
		 * --------------------------
		 * 입력 : 1
		 * 저장되었습니다.
		 * 입력 : 2
		 * 출력되었습니다.
		 * 입력 : 3
		 * 종료되었습니다. 반복문종료 <-이모양이 되게 출력
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("-----------menu-----------");
			System.out.println("1.저장|2.출력|3.종료");
			System.out.println("--------------------------");
			System.out.println("입력 : ");
			num=scan.nextInt();			
			//실제 기능 처리
			switch(num) {
			case 1:
				System.out.println("저장되었습니다.");
				break;
			case 2:
				System.out.println("출력되었습니다.");
				break;
			case 3:
				System.out.println("종료되었습니다.");
				break;                       
			default:
				System.out.println("잘못 입력되었습니다.");          //if(num==3) {
			}}while(num!=3);//3이 아니라면 반복                    //System.out.println("종료되었습니다.");
				                                               //break;}
			                                                   //}while(true);
		
		scan.close();//까지 적어주면 자동으로 import된다.
		
	}

}
