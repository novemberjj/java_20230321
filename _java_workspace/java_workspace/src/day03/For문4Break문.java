package day03;

import java.util.Scanner;

public class For문4Break문 {

	public static void main(String[] args) {
		//Break문 : 반복문을 빠져나오는 역할을 하는 키워드
		//반복문에서 조건(if)문을 동반한다.
		
		//1~100까지의 합
		int i=1, sum=0;
		for(;;) {
			System.out.print(i+" ");//출력 1...99 100
			sum= sum+i; //합계 1 +...99+100
			if(i==100) { //조건식
				break;
			}
			i++; //i=i+1 2 100 증감이 가장 마지막에 오는게 for문의 순서와 일치
		}
		System.out.println();
		System.out.println("1~100까지의 합 :"+sum);
		
		/* 한 글자를 입력받아 그대로 입력받은 글자를 출력
		 * y를 입력받으면 종료
		 * a->a, b->b, c->c, y->종료
		 * */
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("----------------");
		
		
		for(;;) {
			System.out.println("한 글자를 입력해주세요. (y/Y 종료)");
			char ch = scan.next().charAt(0); //한글자만 입력받을 때
			System.out.println(ch);
			//chatAt : 지정한 문자의 위치를 추출 0부터 시작
			if(ch=='y'||ch=='Y') {
				System.out.println("종료");
				break;
			}
		}
		
		scan.close();
		}	
	}


