package day07;

import java.util.Scanner;

public class 메메서드 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 랜덤 생성 1~9까지
		 * 유저가 3자리의 숫자를 맞추는 게임
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball 아무것도 안맞으면 out
		 * 야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다
		 * 숫자를 입력해주세요
		 * 다맞으면 종료 게임횟수 출력
		 * */
		
		int comNum[]=new int[3];
		int myNum[]=new int[3];
		
		ranArray(comNum);
		myNumber(myNum);
		print(comNum);
		print(myNum);
		
		
	}

//	public static int randomNum() {
//		int ran=(int)(Math.random()*9)+1;
//		return ran;
//	}
	public static int[] myNumber(int arr[]){
		System.out.println("숫자를 입력해주세요. (1~9까지, 3자리)");
		String str=scan.next();
		String num[]=str.split("");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(num[i]);
		}
		return arr;
	}
	public static boolean isContain(int arr[],int num) {
		for(int tmp : arr) {
			if(tmp==num) {
				return true;
			}
		}
		return false;
	}
	public static int[] ranArray(int []arr) {
		System.out.println("컴퓨터가 숫자를 생성했습니다.");
		for(int i=0;i<arr.length;i++) {
			int r=(int)(Math.random()*9)+1;
			if(! isContain(arr, r)) {
				arr[i]=r;
			}else {
				i--;
			}
		}
		return arr;
	}
	
	public static void print(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
	
	public static void repaet(int arr[], int arr2[]) {
		int s=0;
		int b=0;
		int i=0;
		int j=0;
		while(true) {
			myNumber(arr2);
			
		}
	}
	
//	public static int compare(int arr[],int arr2[]) {
//		int s=0;
//		int b=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr[i]==arr2[j]&&i==j) {
//					s++;
//				}else if(arr[i]==arr[j]&&i!=j) {
//					b++;
//				}
//			}
//		}
//		if(s==0&&b==0) {
//			System.out.println("OUT");
//		}else {
//			System.out.println(s+"S"+b+"B");
//		}
//		
//	}
	
	
}
