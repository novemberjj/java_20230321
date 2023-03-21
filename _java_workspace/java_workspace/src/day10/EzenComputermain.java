package day10;

public class EzenComputermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EzenComputer ec= new EzenComputer("홍길동","010-0000-0000",25,"990101", "인천");
		ec.printInfor();
		ec.printCompany();
		ec.insertCourse("java", "6개월");
		ec.insertCourse("html", "1개월");
		ec.insertCourse("DB", "1개월");
		ec.printCourse();
		System.out.println();
		
		EzenComputer ec1= new EzenComputer();
		ec1.setAge(25);
		ec1.setBirth("000606");
		ec1.setBreanch("서울");
		ec1.setName("홍길길");
		ec1.setPhone("0102525458");
		ec1.printInfor();
		ec1.insertCourse("java", "6개월");
		ec1.insertCourse("java단과", "1개월");
		ec1.printCourse();
		
		System.out.println();
		System.out.println("=-----------------------");
		
		/* 배열로 5명의 학생을 등록 후
		 * - 학생 이름으로 검색
		 * - 지점명으로 검색
		 * */
		
		
		EzenComputer[] std= new EzenComputer[7];
		std[0]= new EzenComputer("홍길동","010-1234-4568","인천");
		std[1]= new EzenComputer("홍길순","010-4654-4568","서울");
		std[2]= new EzenComputer("홍감찬","010-4682-4568","인천");
		std[3]= new EzenComputer("유관순","010-8954-4568","부천");
		std[4]= new EzenComputer("홍길동","010-7844-4568","서울");
		std[5]=ec;
		std[6]=ec1;
		
		String searchName="홍길동"; //홍길동이 상담받은 지점정보 출력/개인정보 출력
		System.out.println("----------검색 > 홍길동 ------------");
		for(int i=0;i<std.length;i++) {
			if(std[i].getName().equals(searchName)) { //searchName.equals(std[i].getName())도 가능 a랑 b랑 같은지 보는거
				std[i].printInfor();
				std[i].printCompany();
			}
		}
		
		String searchBreanch="인천"; //지점정보 //개인정보 출력
		System.out.println("-------------검색 >"+searchBreanch+"-----------");
//		for(int i=0;i<std.length;i++) {
//			if(std[i].getBreanch().equals(serchBreanch)) {
//				std[i].printInfor();
//				std[i].printCompany();
//			}
//		}
		//향상된 for문
		for(EzenComputer tmp : std) {
			if(tmp.getBreanch().equals(searchBreanch)) {
				tmp.printInfor();
				tmp.printCompany();
			}
		}
		
	}

}
