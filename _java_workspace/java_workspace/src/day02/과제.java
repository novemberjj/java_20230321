package day02;

public class 과제 {

	public static void main(String[] args) {
		/* 1~100까지의 2의 배수(짝수)를 출력
		 * 2 4 6 8 10
		 * 12 14 16 18 20
		 * */

	   for(int i=1; i<=100;i++) {
		   if(i%2==0) {
			   System.out.print(i+" ");
			   //10의 배수일때만 줄바꿈을 함. 여기서 줄바꿈을 해야함
			   if(i%10==0) {
				   System.out.println();
			   }
		   }
	   }
	}
}

