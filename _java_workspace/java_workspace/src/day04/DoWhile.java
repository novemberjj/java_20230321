package day04;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/* for, while문은 조건식이 한 번도 실행이 안될 수도 있음.
		 * do{
		 *  실행문;
		 * }while(조건문); //조건식 필수
		 * */
		
		/* 값을 입력하면 그대로 출력하는 구문
		 * 단, y/Y가 입력되면 종료
		 * */
		
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println();
		
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		do {
			System.out.println("문자를 입력해주세요.(y/Y:종료)");
			ch = scan.next().charAt(0);
			System.out.println(ch);
			//if(ch=='y'||ch=='Y') {
				//break;}
			//while(true); <-조건식이 맞아야 돌아간다 무조건 맞다고 하면 됨
			}while(!(ch=='y'||ch=='Y')); 
		
		System.out.println("종료");

		scan.close();
		
		
	}

}
