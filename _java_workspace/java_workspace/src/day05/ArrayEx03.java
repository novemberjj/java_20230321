package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		/* 5자리 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력
		 * ex) 11456 => 65411 =>6+5+4+1+1
		 * ex) 19874 => 47891 =>4+7+8+9+1
		 * %, /
		 * 11456%10=6(끝자리를 탈락시키려고 함) =>배열에 저장
		 * 11456/10=1145
		 * */
		
		//1.스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		//2. 입력받기
		System.out.println("5자리 숫자를 입력해주세요.");
		int num=scan.nextInt();  // 11456
			
		//3. 배열선언, 변수들 선언
		int arr[]=new int[5];
		int sum=0, i=0;
		
		//4. 반복문 이용하여 마지막 자리가 없어질 때까지 배열에 저장 /  합계
		// / % while문을 이용
		
		while(num>0) {//입력받은 num가 0이 되기전까지 반복
			//조건이 true가 될때 돌아간다
			
			int b =num%10; //마지막자리
			arr[i] = b;
			sum=sum+b;
			num= num/10; //몫만 저장 소수점은 버려짐.
			//System.out.print(arr[i]+" ");
			i++; //다음번지로 넘겨줘야함
		}
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("sum : "+sum);
		
		scan.close();	
	}

}
