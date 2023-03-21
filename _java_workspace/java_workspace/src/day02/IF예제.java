package day02;

import java.util.Scanner;

public class IF예제 {

	public static void main(String[] args) {
		/* 정수를 입력받아서 정수가 짝수인지 홀수인지 판단하여 출력.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in); //ctril+shift+o
		
		System.out.println("정수를 입력해 주세요.");
		//숫자를 입력해주세요.
		
		
		int num= scan.nextInt();
		
			
		if(num%2==0) {
			System.out.println(num+" : 짝수");
		}else if(num%2 ==1) {
			System.out.println(num+" : 홀수");
		}
		
		
		scan.close();
			
				
				

	}

}
