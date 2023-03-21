package day05;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루는 클래스
		 * String str = new String();
		 * String str = "가나다"; //일반 자료형처럼 이용가능.
		 * 
		 * */
		
		String str ="Hello world~!!";
				System.out.println(str);
				
	   
		//charAt(index) : index번지에 있는 문자열을 반환
				System.out.println("--charAt--");
				System.out.println(str.charAt(0));//str의 0번지 출력
				
	    //length : 전체 글자의 길이
				System.out.println("--length--");
				System.out.println(str.length());
				
	    //compareTo(str) : str문자열과 비교하여 같으면 0, 사전 순으로 앞이면 -1, 뒤면 1
				System.out.println("--compareTo--");
				System.out.println("b".compareTo("a")); //==1 //문자를 오름차순 내림차순으로 정렬할때 사용
				System.out.println("b".compareTo("b"));
				System.out.println("b".compareTo("g")); 
				
	    //concat(str) : 이어붙이기 (+ 연산자와 같은 의미)
				System.out.println("--concat--");
				System.out.println("abc".concat("def"));
				System.out.println("abc"+"def");
				
	    //equals : 두 문자열이 같은지 확인 (대소문자 구분)
				System.out.println("--equals--");
				System.out.println("abc".equals("def"));
				System.out.println("abc".equals("abc"));
				System.out.println("abc"=="abc"); //==은 안되는 경우가 더많다 정확한건 equals
				
	    //indexOf(str) : 문자의 위치를 찾아주는 기능, 찾는 문자가 없으면 -1을 반환
				System.out.println("--indexOf--");
				System.out.println("abc".indexOf("d"));
				String email = "novemberjj30@gmail.co.kr";
				System.out.println(email.indexOf("@"));
				System.out.println(email.indexOf(".")); //첫발견 위치
				System.out.println(email.lastIndexOf("."));//끝에서부터 찾아라
				
	    //substirng : 문자열 추출
				System.out.println("--substring--");
				System.out.println(email.substring(0, 5)); //index-1 끝에 인덱스는 포함하지 않음 0부터 시작이니까 개수라고 생각
				System.out.println(email.substring(0, email.indexOf("@")));
				System.out.println(email.substring(email.indexOf("@")+1)); //시작만 넣으면 끝까지 간다
	   
				
		//trim : 불필요한 공백 삭제
				System.out.println("--trim--");
				System.out.println("       Hello        ".trim());
				
	    //replace : 글자 치환
				System.out.println("--replace--");
				System.out.println("Hello World".replace("World", "JAVA")); //모든 값이 다같이 바뀜
				
		//split : 특정 기호를 기준으로 나누기
				System.out.println("--split--");
				String str1= "dog,cat,tiger";
				String[] arr=str1.split(",");
				for(String tmp : arr) {
					System.out.println(tmp);
				}
				
				String num1 = "1";
				String num2 = "2";
				String sum = num1+num2;
				System.out.println(sum);
				
		//parseInt : 문자를 숫자로 변환
				int num3 = Integer.parseInt(num1); //Integer : int의 정수 클래스 //첫번째 글자 대문자면 클래스
				System.out.println(num3);
				int num4= Integer.parseInt(num2);
				System.out.println(num4);
				int sum1 =num3+num4;
				System.out.println(sum1);
				
	}

}
