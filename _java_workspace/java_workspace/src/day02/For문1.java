package day02;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할때 사용하는 문법
		 * 종류 : for, while, do~while
		 * for(1초기화 ; 2.5.8.11조건식 ; 4.7.10증감연산식){
		 * 3.6.9실행문;
		 * }
		 * 
		 * 1. 초기화 : 조건식이나, 실행문에서 사용하는 변수를 초기화
		 * 처음 한 번만 실행 (생략가능)
		 * 2. 조건식 : 반복문의 반복을 결정하는 식. 참이면 반복, 거짓이면 그만.
		 * (생략가능 => 생략하면 무조건 true)
		 * 3. 증감연산식 : 조건식에서 사용되는 변수를 증가/감소 시켜서 반복횟수를 결정 (생략가능)
		 * */
		
		/* 1~10까지 출력하는 예제
		 * 초기화 : 1부터 (i=1)
		 * 조건식 : 10까지 (i<=10)
		 * 증감연산식 : 1씩 증가 (i = i+1)==(i++)
		 * 실행문: i를 출력 
		 * 반복 종료후 실행문 : 없음.
		 * */
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		
		System.out.println(); //줄바꿈용
		/* 지역변수의 범위 { 선언      소멸}
		 * for문 밖에서 선언하면 i를 전부 다른 변수로 선언해야함
		 * */
		
		for(int i=1; i<=10; i=i+2) { //(i=i+a => i+=a
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		/* 10부터 1까지 출력
		 * 초기값 (i=10)
		 * 조건식 (i>=1)
		 * 증감식 (i--)
		 * */
		
		for(int i=10; i>=1; i-- ) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		/* 1~10까지 짝수만 (2,4,6,8,10)
		 * 초기값 (i=2) 
		 * 조건식 (1<=10)
		 * 증감식 (i+=2)
		 * */
		
		for(int i=2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		System.out.println(" ");
		
		/* 1~10까지 짝수만 출력
		 * if문을 사용해서 조건에 맞을 때만 출력
		 * */
		
		/*for(int i=2; i<=10; i=i+2) {
			if(i%2==0) {
				System.out.print(i+" ");
			}		
		}*/
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) { //짝수가 되는 조건식
				System.out.print(i+" ");
			}
		}
		
		/* 1~10까지의 합계
		 * 초기화 : 1부터 i=1
		 * 조건식 : 10까지 i<=10
		 * 증감식 : i++
		 * 실행문 : 누적
		 * 실행 후 출력 (sum)
		 * */
		
		System.out.println(" ");
		
		int i;
		int sum=0; //sum이 필요함
		for(i=1; i<=10; i++) {
			sum= sum+i; //더하기만(sum+=i)
		}
		System.out.println(sum);
		
		System.out.println(" ");
		
			
		
		
		
		
	}

}
