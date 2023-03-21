package day05;

public class String02 {

	public static void main(String[] args) {
		/* 이것이자바다.txt파일에서 파일명과 확장자를 분리하여 출력 
		 * 파일명 : 이것이자바다
		 * 확장자 : txt
		 * */
		
		//String fileName = "이것이자바다.txt";
		String str="이것이자바다.txt";
		
		String name = str.substring(0, str.indexOf("."));
		System.out.println("file : "+name);
		
		String file = str.substring(str.indexOf(".")+1);
		System.out.println("확장자 : "+file);
		
		System.out.println(str.substring(0, str.indexOf(".")));
		System.out.println(str.substring(str.indexOf(".")+1));
		
		//contains(str) : 해당 글자가 포함되어있는 지를 체크 boolean
		System.out.println(str.contains("자바")); 
		
	}

}
