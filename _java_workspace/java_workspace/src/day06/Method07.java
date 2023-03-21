package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력(void)
		 * ex) 3, * => ***
		 * ex) 5, O => OOOOOO
		 * ex) 7, ♥ => ♥♥♥♥♥♥♥
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num =scan.nextInt();
		System.out.println("기호를 입력해주세요.");
		char ch=scan.next().charAt(0);
		
		print(num,ch);
		
		scan.close();
		

	}
	
	public static void print(int num, char ch) {
		
		for(int i=1;i<=num;i++) {
			System.out.print(ch);
		}
		
	}
}
