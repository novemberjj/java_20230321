package day12;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// num1,num2,연산자 입력하여 메서드 실행
		//예외처리
		
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("숫자 두 개를 입력해주세요");
//		int num1=scan.nextInt();
//		int num2=scan.nextInt();
//		System.out.println("연산자를 입력해주세요.");
//		char ch=scan.next().charAt(0);
		
		try {
			//예외발생가능성이 있는 구문
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '%'));
			System.out.println(calc(4, 0, '$'));
			System.out.println(calc(4, 0, '/'));
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();//어디에서 에러났는지 알려줌
		}
		System.out.println("계산기 종료");
		
		

	}
	//기능 : 두 수를 입력받고, 연산자를 입력받아, 4칙연산의 결과를 리턴하는 메서드 생성
	//throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생됨.
	//throw를 발생시키면 메서드 선언부 끝에 throws 발생할 수 있는 예외를 반드시 적어줌
	//throws RuntimeException의 경우 생략가능.
	public static double calc(int num1,int num2,char op) throws RuntimeException {
		double answer=0;
		//예외처리는 앞에서 미리 해주는게 좋음
		if((op=='/'||op=='%')&&num2==0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		case '+': answer=num1+num2; break;
		case '-': answer=num1-num2; break;
		case '*': answer=num1*num2; break;
		case '/': answer=num1/num2; break;
		case '%': answer=num1%num2; break;
		default:
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		return answer;
	}

}
