package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (1~9까지만) //배열로 생성
		 * 유저가 3자리의 숫자를 맞추는 게임 //배열로 생성
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 안맞으면 out
		 * count
		 * 내가 맞힐때까지 반복 출력
		 * 3 5 7
		 * 3 4 6
		 * 1s
		 * 
		 * 3 5 7
		 * 3 7 5
		 * 1s 2b
		 * 
		 * 3 5 7
		 * 6 8 1
		 * 3out
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력해주세요.(1~9, 3자리)
		 * 3 5 6
		 * 2s
		 * 3s
		 * 종료(게임횟수출력)
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int comNum[] = new int [3];
		String mymy[] = new String [3];
		int s=0;
		int b=0;
		int count=0;
		int myNum[]=new int [3];
		
		
		//comNum은 랜덤으로 중복을 제거하면서 생성
		for(int i=0;i<comNum.length;i++) {
			comNum[i]=randomNum();
			for(int j=0;j<i;j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int tmp : comNum) {
			System.out.print(tmp+" ");
		}
		
		System.out.println("> 야구게임 시작");
		System.out.println("컴퓨터가 숫자를 생성했습니다.");
		
		/* 문자인 숫자를 입력받기
		 * 문자를 숫자로 바꾸기 Integer
		 * 숫자를 배열로 저장하기
		 * 
		 * */
		
		while(true) {
		
		System.out.println("숫자를 입력해주세요 > 1~9까지, 3자리");
			
		String str=scan.next();
		mymy=str.split("");
		count++;
		for(int i=0;i<mymy.length;i++) {
			myNum[i]=Integer.parseInt(mymy[i]);
		}
		
		for(int i=0;i<comNum.length;i++) {
			for(int j=0;j<myNum.length;j++) {
				if(comNum[i]==myNum[j]&&i==j) {
					s++;
				}else if(comNum[i]==myNum[j]&&i!=j) {
					b++;
				}
				}
			}
		
		if(s==0&&b==0) {
			System.out.println("OUT");
		}else {
			System.out.println(s+"strike"+b+"ball");
		}
		if(s==3) {
			System.out.println("정답");
			System.out.println("게임종료");
			break;
		}
		
		
		}
		
		/* out의 조건
		 * s도아니고 b도 아닐때
		 * s==0&&b==0
		 * */
		
		
		
		
	
		
		
		scan.close();
		
		
	}
	public static int randomNum() {
		return (int)(Math.random()*9)+1;
	}
	
	public static int[] array(int num) {
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i]=num;
		}
		return arr;
	}
	
	
}
