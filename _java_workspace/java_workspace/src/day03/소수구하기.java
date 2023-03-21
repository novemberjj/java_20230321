package day03;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기자신의 수만 가지는 수를 소수
		 * 소수 : 3, 5, 7, 11, 13...
		 * 소수는 약수가 2개인 수(1, 나 자신)
		 * num을 입력받아서 입력받은 num이 소수인지 아닌지 판별
		 * */
		
		/* 누적 합계 : sum=sum+i
		 * 개수 : count=count+1
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num=scan.nextInt();//순서 중요 입력유도 문자 먼저 나와야함
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				//약수의 개수
				count=count+1; //count++
			}
		}
		System.out.println();
		
		if(count==2) {
			System.out.println(num+" 소수 O");
		}else {
			System.out.println(num+" 소수 X");
		}
		
		scan.close();
		
		System.out.println("---------------------");
		
		/* 2~100까지의 소수를 출력
		 * */
		//2~100까지의 num1
		
		int cnt=0;
		for(int num1=2;num1<=100;num1++) {
			cnt=0;
		
		}
		
		scan.close();
		
		
		//System.out.println(num1+">>>"+cnt);
		/*if(cnt==2) {
			System.out.print(num1+" ");
			*/


		
	}

}
