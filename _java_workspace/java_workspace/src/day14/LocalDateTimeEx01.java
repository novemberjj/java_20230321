package day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String curr= today.toString();
		System.out.println(curr);
		
		//2023-02-17T15:30:06.220537100
		//날짜만 분리시켜 추출하여 찍기
//		System.out.println(curr.indexOf("T"));
//		System.out.println(curr.substring(0, 10));
		String date = curr.substring(0, curr.indexOf("T"));
		System.out.println(date);
		String time = curr.substring(curr.indexOf("T")+1, curr.indexOf("."));
		System.out.println(time);
		
//		System.out.println(curr.substring(0, curr.indexOf("T")));
//		System.out.println(curr.substring(curr.indexOf("T")+1, curr.indexOf(".")));
		
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate= LocalDateTime.of(2009, 9, 30, 8, 30, 7); //원하는 날짜 생성
		System.out.println(sDate.format(dtf));
	}

}
