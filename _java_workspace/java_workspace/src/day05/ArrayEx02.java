package day05;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~10까지 담고 있는 배열 arr를 생성 후 출력
		 * */
		
		int []arr=new int [10];
		
		for(int i=0;i<arr.length;i++) {//0 1 2 3 4 5 6 7 8 9번지 까지 생성
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();//줄바꿈
		
		//배열을 섞는 코드 random을 활용하여 
		//int a=10; -> for문에서 돌아갈 번지
		//int b=20; -> 랜덤에서 선택한 번지
		//int c=a;
		//a=b;//b를 a한테 담은 것
		//b=c;
		//System.out.println("a : "+a+", b: "+b); //그냥 바로 바꿀 수 없음 항상 임시변수를 만들어서 대피시킨 다음 바꿔 줘야 함 그냥 담으면 a의 데이터는 사라짐
		
		//방법 : 랜덤한 번지(0~arr.length)를 선택해서 다른 번지와 교환
		//int random=(int)(Math.random()*10)+시작값
		
		int min=0; //시작번지
		int max=arr.length; //개수
		
		//배열 섞기
		for(int i=0;i<arr.length;i++) {
			int random=(int)(Math.random()*max)+min; //0~10개
			
			//arr[0],arr[random]번지 교환
			int tmp=arr[i]; //0번지의 값이 tmp이동
			arr[i]=arr[random];
			arr[random]=tmp;
			
			
		}
		System.out.println("--------섞은 후---------");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();//줄바꿈
		
		
		//오름차순 정렬 : 작은 수 부터 앞으로 오게 정렬 
		//내림차순 정렬 : 큰 수부터 앞으로 오게 정렬
		// 5 3 9 6 1 4 7 8 2 10 0번지는 i 뒤에 번지는 j
		// 3 5 9 6 1 4 7 8 2 10
		// 1 5 9 6 3 4 7 8 2 10 pass1 첫번째 칸에 작은 값이 들어와야함
		// 1 3 9 6 5 4 7 8 2 10 0번지 냅두고 1번지랑 뒤에 번지들이랑 비교해서 교환 1번지는 i 뒤에 번지는 j
		// 1 2 9 6 5 4 7 8 3 10 pass2
		// 1 2 6 9 5 4 7 8 3 10
		// 1 2 5 9 6 4 7 8 3 10
		
		for(int i=0;i<arr.length-1;i++) { //끝번지까지 갈 필요 없음
			for(int j=i+1;j<arr.length;j++) { //i다음부터 비교해야함
				if(arr[i]>arr[j]) { //뒷번지보다 앞번지가 크다면 뒤로 보낸다. //오름차순 arr[i]>arr[j] //내림차순 arr[i]<arr[j]
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("-----오름차순 정렬 후 -----");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {//뒷번지보다 앞번지가 작다면 뒤로 보낸다.
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("-----내림차순 정리-----");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	
	}

}
