package day01;

public class IF문2 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력.
		 * 평균이 80이상이면 합격, 아니면 불합격.
		 * 출력 : 합계, 평균, 평가
		 */
		int kor = 95;
		int eng = 100;
		int math = 45;
		int sum =(kor+eng+math);
		System.out.println("합계: "+sum);
		int avg =sum/3;
		System.out.println("평균: "+avg);
		if (avg>=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		/*문제풀이
		 *int kor, eng, math, sm;
		 *double avg;
		 *sum=kor+eng+math;
		 *avg=sum/3.0
		 *Systme.out.println("sum : "+sum)
		 *Systme.out.println("avg : "+avg)
		 *if(avg>=80) {
		 *sysout("합격")} else {sysout("불합격")}
		 */
		
		//평가를 A(평균>=90), B(평균>=80), C(평균>=70), D(평균>=60), F(평균<60)
		if(avg>=90) {
			System.out.println("A");
		}else if(avg>=80) {
			System.out.println("B");
		}else if(avg>=70) {
			System.out.println("C");
		}else if(avg>60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
		
		
	
				

	}

}
