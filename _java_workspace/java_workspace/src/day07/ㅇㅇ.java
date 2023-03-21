package day07;

import java.util.Scanner;

public class ㅇㅇ {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 (1~9까지만) //배열로 생성 => 중복발생 가능성(제거)
		 * 유저가 3자리의 숫자를 맞추는 게임 //배열로 생성
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball, 아무것도 안맞으면 out
		 * count
		 * 내가 맞힐때까지 반복 출력
		 * 3 5 7
		 * 3 4 6
		 * 1s
		 * 
		 * 3 5 7
		 * 3 7 5
		 * 1s 2b
		 * 
		 * 3 5 7
		 * 6 8 1
		 * 3out
		 * --야구게임 시작
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자를 입력해주세요.(1~9, 3자리)
		 * 3 5 6
		 * 2s
		 * 3s
		 * 종료(게임횟수출력)
		 * */
		//들여쓰기 똑바로
		//1. Scanner 열기
		Scanner scan = new Scanner(System.in);
		
		//2. 변수 선언
		int comNum[] = new int[3]; //컴퓨터 배열
		int myNum[]=new int[3];	//내 배열
		int count=0; //게임횟수 출력용 //지역변수는 초기화
		
		                //j번지/i번지
		// 0 0 0 => 3 0 0 => 3 3 0 => 3 4 0
		//3. 컴퓨터가 결정한 3가지 숫자를 중복되지않게 추출
		//반복추출 for문 or while문
		/*for(int i=0;i<comNum.length;i++) {
			comNum[i]=(int)(Math.random()*9)+1; //1~9까지
			for(int j=0;j<i;j++) { //앞번지들만 볼거임 비교값 실제 숫자를 채우는게 아님 중복을 없애는게 역할
				if(comNum[i]==comNum[j]) {
					i--;
					break; //for(j의 구문을 빠져나감) i를 다시 채워라
				}
			}
			
		}*/
		
		//lotto예제에서 만든 메서드 호출
		//Lotto예제 num= new Lotto예제();
		//객체없이 static이면 그냥 호출할 수 있음
		Lotto예제.array(comNum);
		//num.randomNum(comNum);
		
		//Point p = new Point(); //Point 클래스의 객체 생성
		//p.print();//static이 아닌애들은 객체없이 호출 불가
		
		
		
		/*for(int i=0;i<comNum.length;i++) {
			comNum[i]=Lotto예제.randomNum();{
				for(int j=0;j<i;j++) {
					if(comNum[i]==comNum[j]) {
						i--;
						break;
					}
				}
			}
		}*/
		
		for(int tmp:comNum) {
			System.out.print(tmp+" ");
		}
		
		System.out.println(">>야구게임 시작");
		System.out.println("컴퓨터가 숫자를 결정했습니다.");
		
		//4. 사용자 숫자 입력받기
		//comNum 한 번 생성되면 끝
		//사용자 계속 생성되어야 함
		while(true){
			int s=0;
			int b=0;
			System.out.println("> 숫자 입력(1~9, 숫자 3개) : ");
			
			//숫자로 입력받는 경우
			/*for(int i=0;i<myNum.length;i++) {
				myNum[i]=scan.nextInt();
			}*/
			
			//값을 문자로 입력받는 경우
			String myStr = scan.next(); //789 => 한 자리씩 잘라서 배열에 저장
			String[] myNumStrArr= myStr.split("");//한 글자씩 잘라서 배열로 저장
			for(int i=0;i<myNum.length;i++) {
				myNum[i]=Integer.parseInt(myNumStrArr[i]); //String -> int로 변환해줘야 함 Integer.parseInt
			}
			count++; //카운트 1회 증가
			
			//숫자 비교
			for(int i=0;i<comNum.length;i++) { //컴퓨터 Num 기준 탐색
				for(int j=0;j<myNum.length;j++) { //myNum 기준 탐색
					//스트라이크 기준 조건(값&자리수도 같을 경우)
					if(comNum[i]==myNum[j]&& i==j) { 
						s++;
						//ball의 조건(값만 같다면, 자리수는 다를경우)
					}else if(comNum[i]==myNum[j]&&i!=j) {
						b++;
					}
				}
			}
			
			//출력
			//out의 조건 (아무 것도 안맞을 경우)
			if(s==0&&b==0) {
				System.out.println("OUT");
			}else {
				System.out.println("> "+s+"S"+b+"B");
				System.out.println("시도횟수 : "+count);
			}
			
			if(s==3) {
				System.out.println("정답");
				break;
			}
			
		}
		
	
		scan.close();//무한루프 상황일때 에러남
		

	}
	

}
