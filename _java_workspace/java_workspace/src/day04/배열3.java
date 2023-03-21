package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장
		 * 점수의 합계와 평균을 출력
		 * 합계 :
		 * 평균 :
		 * */
		
		int[] arr=new int[5];
		int sum=0;
		double avg;
		/* int size = 5;
		 * int arr[] =new int[size];
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요.");
		
		int max=0;//최대값 담을 공간
		int min=100;
		int i;
		for( i=0;i<arr.length;i++) {
			arr[i]= scan.nextInt();
			sum=sum+arr[i]; //누적이 되려면 나 자신을 담아줘야 한다.(sum)
			//max=Math.max(max,arr[i]); <-Math 클래스 활용 이런 방법도 있다
			/* if(arr[i]>max){
			 * max=arr[i]} 따로 안빼고 여기다가 해도 된다.
			 * */
			//min=arr[0]; 이거 아닌듯
			
			if(min>arr[i]) {
				min=arr[i];
			}
			
			}
		
		avg=sum/(double)arr.length;
		System.out.println("합계 : "+sum);
	    System.out.println("평균 : "+avg);
	    System.out.printf("평균 : %.2f\n", avg);
	
	    for(i=0;i<arr.length;i++) {
	    	if(arr[i]>max) {//전부 다 비교하는 대신 for문으로 돌려준다
	    		max=arr[i];//최대값이 계속 바뀜
	    		
	    	}
	    }
	    
	    System.out.println("최고점수 : "+max); //if문으로 arr[i] 비교 두 개를 비교해서 둘 중에 보다 큰 애를 int max에 저장
	    System.out.println("최저점수 : "+min);
	    
	    
		scan.close();
		
		}
}
