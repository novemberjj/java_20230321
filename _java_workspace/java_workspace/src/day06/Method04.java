package day06;

public class Method04 {

	public static void main(String[] args) {
		/* 1. 랜덤(1~100) 정수 5개를 배열에 담는 메서드 (정수 배열을 리턴)
		 * --------랜덤 메서드를 호출하여 평균을 연산하는 메서드
		 * 2.	배열을 전달받아서 평균을 연산하는 메서드 (평균: double을 리턴)
		 * 3. 정수 5개와 평균을 출력
		 * main에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 * */
		/* 메서드 완성만 되어있으면 어디서든 호출해도 됨
		 * */
		
		
		int arr[] = random(); //여기 지역변수 이름과 매개변수 이름은 일치하지 않아도 됨
		double avg=average(arr);
		//print(arr,avg);
		System.out.println("---------------");
		print(arr, average(arr)); 
		//print(random(),average(random()));
		//위 두개는 다르다 메서드에서 랜덤 두 번 한거랑 메인에서 한 번 된거
		
	}
	
	/* 랜덤(1~100) 정수 5개를 배열
	 * 리턴타입 : 정수배열 => int[]
	 * 매개변수 : X
	 * 메서드명 : random
	 * */
	public static int[] random() {
		int []arr=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	
	/* 배열을 전달받아서 평균을 연산하는 메서드
	 * 리턴타입 : 평균 => double
	 * 매개변수 : 배열=> int arr[]
	 * 메서드명 : average
	 * */
	public static double average(int[] arr) {//배열이 받아진거임 받아졌다 가정하고 쓰면 된다
		//int arr[] =random(); 위에 매개변수 비워놔도 됨
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		//double avg = (double)sum/arr.length;
		//return avg;
		return (double)sum/arr.length;
	}
	
	/* 정수 5개와 평균을 출력
	 * 리턴타입 : 출력은 리턴이 없음 -> void 
	 * 매개변수 : 배열, 평균 -> int arr[], double avg //자료형이 중요한거지 이름은 안중요함
	 * 메서드명 : print
	 * */
	public static void print(int arr[], double avg) {
		System.out.println("5개의 랜덤 정수 값");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("평균 : "+average(arr));
	}
}
