package day09;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {

		/* 야구게임 메서드로 변경
		 * 
		 * 
		 * */
		/* 메서드 : 매개변수의 개수는 정해진 것이 없음
		 * 리턴타입 => 하나
		 * 
		 * 랜덤번호 생성
		 * 배열에 추가(중복메서드 포함여부)
		 * 스트라이크 메서드
		 * 볼 메서드
		 * 출력메서드
		 * 반복문은 메인에서
		 * */
		int comNum[]; //new로 객체를 안만들었다면 null ->이게 randomArray로 들어간다면 값을 줄 수 없음
		int com[]=new int[3];
		int user[]=new int[3];
		//랜덤수 범위
		int max=9, min=1;
		int s=0, b=0;
		int cnt=0;
		
		Scanner scan=new Scanner(System.in);
		randomArray(com, max, min);
		System.out.println(">> 야구게임 시작");
		System.out.println("컴퓨터가 숫자를 생성했습니다.");
		
		
		while(s!=3) { //3이 아니라면 돌려라....?
			//사용자번호 입력받기
			System.out.println("숫자를 입력해주세요. (1~9까지, 3자리)");
			for(int i=0;i<user.length;i++) {
				user[i]=scan.nextInt();
			}
			
			//결과 판정
			s=strike(com, user);
			b=ball(com, user);
			//System.out.println(s+"S "+b+"B");
			//0일때 표현하지 않게 처리
			if(s!=0) {
				System.out.print(s+"S ");
			}
			if(b!=0) {
				System.out.print(b+"B ");
			}
			System.out.println();
			if(s==0&&b==0) {
				System.out.println("OUT");
			}
			cnt++;
			System.out.println("게임횟수 : "+cnt);

			
		}
		System.out.println("정답!");
		System.out.println("게임 종료");
		
		
		
		
		scan.close();
		
		
		
		
	}
	//랜덤번호 생성 : 매개변수로 범위를 설정=>다른데서도 쓸 수 있다 20~30 -> cnt=10 start=20
	//범위 => min,max 20~30 cnt=>max-min+1
	//(int)(Math.random()*max-min+1)+min
	//매개변수 =>개수, 시작값(int)(Math.random*개수)+시작
//	public static int random (int start, int cnt) { //min시작값 max개수
//		return (int)(Math.random()*cnt)+start;
//	}
	//범위 => min,max 20~30 cnt=>max-min+1
			//(int)(Math.random()*max-min+1)+min
	public static int random(int max, int min) { //올바른 값을 갖게 하는 메서드
		if(max<min) { //max와 min의 숫자 값이 바뀌어서 들어올때 처리
			int tmp=max;
			max=min;
			min=tmp;
		}
		return (int)(Math.random()*(max-min+1))+min;
	}
	//중복확인 메서드
	public static boolean isContain(int arr[], int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false; //for문이 끝난 이후에 
	}
	//배열 생성 메서드(중복제거)
	//true가 리턴되면 정상적으로 배열이 생성됨을 알려주게 하기 위해 boolean 굳이 배열을 리턴할 필요는 없음 
	public static boolean randomArray (int arr[],int max, int min){
		if(arr==null) {
			return false;
		}
		if((max-min+1) <arr.length) { //랜덤수의 개수가 배열의 length보다 작다면 만들 수가 없다
			return false;
		}
		int i=0;
		while(i<arr.length) {
			int r=random(max, min);
			if(! isContain(arr, r)) {
				arr[i]=r;
				i++;
			}
		}
		return true; //void라면 false들은 sysout으로 값없다고 출력
	}
	
	//배열 출력 메서드
	public static void printArray(int []arr) {
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		System.out.println(); //줄바꿈 포함
	}
	//스트라이크 메서드
	// 기능 : com[], user[]위치와 값이 일치하면 카운트 반환
	//메서드명 : strike
	/* 0 1 2 [번지]
	 * 3 5 4
	 * 1 2 3
	 * */
	
	public static int strike(int com[],int user[]) {
		int cnt=0;
		for(int i=0;i<com.length;i++) {//ball을 같이 했어서 이중포문
			if(com[i]==user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	/* ball 메서드
	 * 기능 :com[], user[]위치상관없이 일치하면 카운트 증가 반환기능
	 * 메서드명 : ball
	 * */
	public static int ball(int com[],int user[]) {
		int cnt=0;
		for(int i=0;i<com.length;i++) {//이중포문 쓰는 것도 상관없음
			if(isContain(user, com[i])) {
				cnt++; //자리 상관없이 일치하면 count 증가 =>strike도 포함
			}
		}
		//스트라이크 개수만큼 차감
		return cnt-strike(com, user);
	}

}
