package studentmanager;

import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		/*class Main - 
		- 메뉴 구성
		1. 학생 등록
		2. 학생 확인(학생 리스트)
		3. 학생 검색(한 학생의 정보가 출력- 학생정보, 수강 정보 포함)
		4. 수강 신청
		5. 수강 철회
		6. 종료
		 * */
		
		ProgramManager pm = new ProgramManager();
		Scanner scan= new Scanner(System.in);
		int menu=0;
		
		do {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1.학생등록|2.학생확인|3.학생검색");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			System.out.println("메뉴 선택 > ");
			menu= scan.nextInt();
			
			switch(menu) {
			case 1: pm.insertStudent(scan); break;
			case 2: pm.printStudent(); break;
			case 3: pm.searchStudent(scan);; break;
			case 4: pm.registerSubject(scan);; break;
			case 5: pm.deleteSubject(scan);; break;
			case 6: break;
			default: System.out.println("1~6까지 숫자 중에 입력해주세요.");
			}
			
		}while(menu!=6);
		
		System.out.println("프로그램 종료");
		
		scan.close();

	}

}
