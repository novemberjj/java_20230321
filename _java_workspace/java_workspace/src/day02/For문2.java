package day02;

public class For문2 {

	public static void main(String[] args) {
		/* 2단 출력
		 * 2*1=2, 2*2=4, 2*3=6 ... 2*9=18
		 * 규칙을 먼저 발견해야 함.
		 * */
		
		int num=9;
		for(int i=1;i<=9;i++) {
			System.out.print(num+"X"+i+"="+(num*i)+" ");
		}
		System.out.println(" ");
		
		/* 1~10까지의 홀수의 합, 짝수의 합을 출력
		 * */
		
		int i;
		int evenSum=0, oddSum=0;
		
		for(i=1;i<=10;i++) {
			if(i%2==0) {//짝수의 조건
				//짝수의 합계
				evenSum= evenSum+i;
			}else {
				//홀수의 합계
				oddSum=oddSum+i;
			}
		}	
			System.out.println("짝수 합계 : "+evenSum);
			System.out.println("홀수 합계 : "+oddSum);
			
			//2중 for문
			// 2단, 3단, 4단, 5단...9단
			//2*1, 2*2, 2*3...*9 
			//2단 1~9까지, 3단 1~9
			
			for(int j=2;j<=9;j++) { //j=2 i=1,2,3,4....
			for(i=1;i<=9;i++) { 
				System.out.println(j+"X"+i+"="+(j*i));
			}
			}
			for(int j=1;j<=9;j++) {
				for(i=2;i<=9;i++) {
					System.out.print(i+"*"+j+"="+(j*i)+"        ");
				}
				System.out.println(" ");
			}
			
			
			
	}
	}
		
		
		

		
		
		
		
	


