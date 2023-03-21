package studentmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramManager implements Program {
	private List<Student> stdList= new ArrayList<Student>();

	@Override
	public void printStudent() {
		System.out.println("-- 학생 리스트 --");
		for(int i=0;i<stdList.size();i++) {
			stdList.get(i).stdPrint();
		}
		System.out.println();
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("-- 학생 등록 --");
		System.out.println("이름 >");
		String stdName= scan.next();
		System.out.println("학번 >");
		String stdCode= scan.next();
		System.out.println("학부 >");
		String faculty=scan.next();
		System.out.println("학과 >");
		String major=scan.next();
		
		stdList.add(new Student(stdName, stdCode, faculty, major));

	}

	@Override
	public void searchStudent(Scanner scan) {
		int index=-1;
		System.out.println("-- 학생 검색 --");
		System.out.println("이름 > ");
		String stdName= scan.next();
		for(int i=0;i<stdList.size();i++) {
			if(stdName.equals(stdList.get(i).getStdName())) {
				stdList.get(i).stdPrint();
				stdList.get(i).subPrint();
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		int index=-1;
		System.out.println("-- 수강 신청 --");
		System.out.println("이름 > ");
		String stdName= scan.next();
		for(int i=0;i<stdList.size();i++) {
			if(stdName.equals(stdList.get(i).getStdName())) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("과목 >");
			String subName=scan.next();
			stdList.get(index).inserSubject(new Subject(subName));;
			
		}
		
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		int index=-1;
		System.out.println("-- 수강 철회 --");
		System.out.println("이름 > ");
		String stdName= scan.next();
		for(int i=0;i<stdList.size();i++) {
			if(stdName.equals(stdList.get(i).getStdName())) {
				index=i;
			}
		}
		if(index==-1) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("과목 >");
			String subName=scan.next();
			stdList.get(index).deleteSubject(subName);
			
		}
		
	}
	

		
	

}
