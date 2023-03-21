package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject {
	private HashMap<String,Integer>map= new HashMap<>();

	private int exit=0;
	Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		/* map을 이용 성적관리 프로그램 생성
		 * >>menu
		 * 1. 성적추가 (국어 97)
		 * 2. 성적조회 (전체출력) : 합계/평균 같이 출력
		 * 3. 성적조회 (과목) : 서치 후 일치하는 과목 출력
		 * 4. 성적수정 : 서치 후 수정
		 * 5. 성적삭제
		 * 6. 종료 
		 * CRUD
		 * C(create)생성 R(read)읽기 U(update)수정 D(delete)삭제 
		 * */
		//ArrayList<클래스명> 
		
		Subject s= new Subject();
		s.menu();
		//s.scan.next(); ->객체에서 가져오기

		
	}
	//메뉴 print
	
	public void menu() {
		while(exit!=6) {
			System.out.println("--메뉴--");
			System.out.println("1. 성적 추가");
			System.out.println("2. 성적 전체 조회");
			System.out.println("3. 성적 선택 조회");
			System.out.println("4. 성적 수정");
			System.out.println("5. 성적 삭제");
			System.out.println("6. 종료");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			exit=scan.nextInt();
			
			switch(exit) {
			case 1: add(); break;
			case 2: print(); break;
			case 3:	search(); break;
			case 4: re(); break;
			case 5: delete(); break;
			case 6: System.out.println("종료"); break;
			default: System.out.println("해당하는 메뉴가 없습니다."); break;
			}
		}
	}
	
	//성적 추가
	public void add() {
		while(exit!=0) {
			System.out.println("과목을 입력해주세요.(ex: 국어 90)");
			String subject=scan.next();
			System.out.println("점수를 입력해주세요.");
			int score=scan.nextInt();
			map.put(subject, score);
			System.out.println("계속: 1 종료: 0");
			exit=scan.nextInt();
		}
	}
	//전체 출력
	public void print() {
		int sum=0;
		System.out.println("성적 조회");
		Iterator<String>it=map.keySet().iterator();
		while(it.hasNext()) {
			String subject=it.next();
			int score=map.get(subject);
			System.out.println(subject+":"+score);
			sum+=score;
		}
		System.out.println("합계:"+sum);
		System.out.printf("평균:%.2f",+(double)sum/map.size());
		System.out.println();

	}
	
	//과목 조회 후 출력
	public void search() {
		System.out.println("조회할 과목을 입력해주세요.");
		String subject=scan.next();
			if(map.keySet().contains(subject)) {
				System.out.println(subject+":"+map.get(subject));
		}else {
			System.out.println("조회하신 과목이 없습니다.");
		}
		
	}
	
	//수정
	public void re() {
		System.out.println("수정할 과목을 입력해주세요.");
			String str=scan.next();
			System.out.println("점수를 입력해주세요.");
			int score=scan.nextInt();
			map.put(str, score);//map의 key는 중복 불가 해당하는 과목을 그냥 입력하면 덮어쓰기
			System.out.println(str+":"+map.get(str));
			System.out.println("수정되었습니다.");
			
		
	}
	//삭제
	public void delete() {
		System.out.println("삭제할 과목을 입력해주세요.");
		String str=scan.next();
			map.remove(str);
			System.out.println("삭제되었습니다.");
		
	}
	
	
	
	

}
