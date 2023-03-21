package day03;

public class 이중For문1 {

	public static void main(String[] args) {
		/* for(1초기화 ; 3 14 22조건식 ; 13 21증감식){ //1 2 3
		 * 		4 15실행문;
		 *      for(5 16초기화 ; 6 9 12 17조건식 ; 8 11 19증감식 { //1~끝까지, 1~끝까지,
		 *     		7 10 18실행문;
		 *     }
		 * }
		 * */
		//1 -> 1 -> 1~끝까지, 1-> 2-> 1~끝까지
		
		/* ***** 줄 = i 별 = j
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 * 가로/세로 5*5의 별을 찍어보자
		 * */
		
		//1줄 ***** 줄 -> i1 별 -> j5
		//2줄 ***** i2 j5
		//3줄 ***** i3 j5
		
		
		//j의 실행문 : 별을 찍기
		//i의 실행문 : 줄바꿈
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		/* *		i=1, j=1
		 * **		i=2, j=2
		 * ***		i=3, j=3
		 * ****		i=4, j=4
		 * *****	i=5, j=5
		 * */
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		/*     * i=1 공=4 j=1
		 *    ** i=2 공=3 j=2
		 *   *** i=3 공=2 j=3
		 *  **** i=4 공=1 j=4
		 * ***** i=5 공=0 j=5
		 * */
		
		
		//OOOO*
		//OOO**
		
		/* ****
		 * ***
		 * **
		 * *
		 * *
		 * **
		 * ***
		 * ****
		 * */
		
		for(int i=1;i<=5;i++) {
			//공백
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			//별
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			//다 찍고 나서 줄바꿈
			System.out.println();
		}
		
		System.out.println("----------------------------");
		
		/* if문을 이용한 방법
		 * */
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) {//j=1, i=1
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
}
