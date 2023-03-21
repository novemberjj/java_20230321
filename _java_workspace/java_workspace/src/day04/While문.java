package day04;

public class While문 {

	public static void main(String[] args) {
		/* while(조건식){
		 *  실행문; //조건식이 false가 될 수 있는 구문을 포함해야 함.
		 *  증감식;
		 *  }
		 *  
		 *  초기화 //for문과 while문은 동작하는 방식이 같다. //규칙적인 거for 
		 *  while(조건식){
		 *  실행문;
		 *  증감식:
		 *  }
		 * 
		 * */
		/*1~10까지 출력
		 * */
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println(" > while문 활용");
		int i=1; //초기값
		while(i<=10) {//조건식
			//실행문
			System.out.print(i+" ");
			//증감식
			i++;
		}
		
		System.out.println();
		System.out.println(">> while문을 활용하여 1~10까지 짝수만 출력");
		
		System.out.println();
		
		int k=1;
		while(k<=10) {//조건식 - 반복을 하기 위한 조건
			if(k%2==0) {
				System.out.print(k+" "); //짝수만 출력
			}
			k++;
	}
		System.out.println();
		
		
		//continue문을 이용한 1~10까지 출력
		int j=1;
		while(j<=10) {
			j++;
			if(j%2!=0) { //if(j%2!=0)
				//j++;
				continue;
			}
			System.out.print(j+" ");
			//j++; if문안에 들어오면 증감식이 두 번 들어와야함
		}
		
		
		
	}
}
