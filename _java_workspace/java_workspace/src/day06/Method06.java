package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 구구단 1단을 출력(void)하는 메서드
		 * 입력 : 7 -> 7단 출력
		 * */
		//여기서 입력받은 숫자가 메서드에서 적용되어야 한다.
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("숫자를 입력해주세요.");
	int num=scan.nextInt();
	
	print(num);
	System.out.println("-----------------------");
	print(2);
	
	scan.close();

	}
	/* 구구단 출력
	 * 매개변수 : 단 => int num
	 * 리턴 : void
	 * 메서드명 : print
	 * */
	
	public static void print(int num) {
		
		for(int i=1;i<=9;i++) {
			System.out.println(num+"X"+i+"="+num*i);
		}
		
	}

}
