package day05;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 5개 값을 가지는 배열을 생성 후
		 * 1~50사이의 랜덤값을 저장 후 출력
		 * */
		
		
		//1. 배열을 정의
		int size=5;
		int []arr=new int[size];
		
		//for 배열의 index 탐색
		for(int i=0;i<arr.length;i++) {
			//랜덤값 배열에 저장
			int num=(int)(Math.random()*50)+1;
			arr[i]=num;
			//arr[i]=(int)(Math.random()*50)+1;
			//랜덤값 출력
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("오름차순 정렬 후 >> ");
		
		for(int i=0;i<arr.length-1;i++) { //0 1 ...
			for(int j=i+1;j<arr.length;j++) { // 1 2 ...
				if(arr[i]>arr[j]) { //뒷번지보다 앞번지가 크면 뒤로 보낸다
					//교환
					int tmp=arr[i]; //arr[i] 자리를 비워줌 arr[j]가 올거임
					arr[i]=arr[j]; //빈 곳에 채워줌
					arr[j]=tmp; //대각선 형태로 되어있다~ 양끝에 tmp 빗살무늬
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		
		System.out.println("향상된 for문 >>");
		//배열을 출력해야 한다 : 0번지부터 끝까지 다 나와야 한다. for문 이용
		//향상된 for문
		for(int tmp : arr) { //임시변수(같은 자료형int tmp : int arr) :을 기준으로 뒷쪽에 있는게 값을 여러개 가진 객체
			System.out.print(tmp+" "); //arr에서 tmp로 처음부터 끝까지 옮겨준다. 건너 뛰는 건 못함. 순차적. <담은 다음에 찍고> 반복. 
		}
		System.out.println();
	
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) { //뒷번지보다 앞번지가 작으면 뒤로 보낸다
					int tmp=arr[i]; //앞번지 자리 비워줌
					arr[i]=arr[j]; //앞번지에 뒷번지 값이 온다
					arr[j]=tmp; //뒷번지에 앞번지 값 채워줌
				}
			}
		}
		System.out.println("내림차순 정렬 후>>");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
