package day12;

public class 익명내부클래스 {

	public static void main(String[] args) {
		/* 내부클래스 : 클래스 내부에 선언한 클래스
		 * - 내부 클래스를 포함한 외부 클래스와 밀접한 연관이 있고, 
		 * 다른 외부에서 내부 클래스를 참조할 일이 없을 경우
		 * - 중첩 클래스라고도 함.
		 * - 인스턴스 내부클래스, 정적(static)클래스, 지역(local) 내부 클래스
		 * 익명(anonymous)내부클래스 -> 익명 클래스를 사용하기 위해 내부클래스를 사용
 		 * */
		Outer out= new Outer();
		Runnable runner=out.getRunnable(10); //runner return 값
		runner.run();

	}

}
class Outer{
	
	int outNum=10;
	static int sNum=20;
	
	//예전에는 매개변수와 지역변수는 final 아니면 선언 불가능했지만, 지금은
	//컴파일에서 자동으로 해줌.
	Runnable getRunnable(int i) { //메서드 안에 들어가는 클래스를 선언하면 지역(local)내부클래스
		//매개변수와 지역변수는 값이 들어올때 final로 변경되서 들어옴.
		int num=100; //final int num과 같은 의미
		
		
		class MyRunnable implements Runnable{
			int localNum=1000;
			
			
			@Override
			public void run() {//안쪽에 안쪽에 안쪽이기 때문에 값들을 다 쓸 수 있음
				//i=10;은 안됨
				//num=1;도 안됨
				System.out.println("매개변수="+i);
				System.out.println("메서드 안 num="+num);
				System.out.println("in클래스안 localNum="+localNum);
				
				System.out.println("out클래스 outNum="+outNum);
				System.out.println("out클래스 static sNum="+sNum);
				
			}
			
		}
		return new MyRunnable();
	}
	
}
