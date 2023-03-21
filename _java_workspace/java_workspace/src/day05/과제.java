package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택(0=가위, 1=바위, 2=보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승 패 무의 결과를 출력
		 * 삼항연산자 (조건식)? true : false;
		 * */
		
		//int num1=3;
		//System.out.println((num1%2==0)? "짝수" : "홀수");
		
		System.out.println("가위 바위 보!");
		Scanner scan = new Scanner(System.in);
		
		int comNum=(int)(Math.random()*3)+0; 
		System.out.println("컴퓨터가 결정을 완료하였습니다.");
		String myChoice=scan.next();
		System.out.println("사용자 : "+myChoice);
		
		//컴퓨터의 선택을 String으로 변환
		String comChoice =(comNum==0)? "가위" : (comNum==1)? "바위" : "보";
		System.out.println("컴퓨터 : "+comChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		}else {//굳이 else if 안해도 됨
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "이겼습니다." : "졌습니다.");
			}
			if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "이겼습니다." : "졌습니다.");
			}else {
				System.out.println(myChoice.equals("가위")? "이겼습니다." : "졌습니다.");
			}
		}
		System.out.println("게임종료!");
		
		scan.close();
		
	}

}
