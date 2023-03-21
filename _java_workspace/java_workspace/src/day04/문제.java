package day04;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		/* 1~50사이의 랜덤수 하나를 생성
		 * 예) 컴퓨터가 랜덤수를 생성했습니다.
		 * 사용자 입력: 20
		 * up!
		 * 사용자 입력: 30
		 * up!
		 * 사용자 입력: 49
		 * down!
		 * 사용자 입력: 45
		 * 정답입니다!!
		 * 
		 * */
		
		
		//스케너 열기
		Scanner scan =new Scanner(System.in);
	    //랜덤수 결정하기
		int num=(int)(Math.random()*50)+1;
		int n=0, count=5;
		System.out.println("컴퓨터가 랜덤 수를 생성했습니다.(1~50까지)");
		
		//반복문 열기 0~50
		
		do {
			System.out.println("입력 : ");
			n=scan.nextInt();
			count--;
			
			if(n<1||n>50) {
				System.out.println("입력 범위를 벗어났습니다. (1~50)");
			}else {
				if(n>num) {
					System.out.println("down!");
				}else if(n<num) {
					System.out.println("up!");
				}else if(n==num) {
					System.out.println("정답");
					break;}
				System.out.println("게임 횟수 제한 : "+count);
				if(count==0) {
					System.out.println("게임 횟수 초과");
					break;
				}
			}
			
		}while(true);
		
		scan.close();
		
		
		
	}

}
