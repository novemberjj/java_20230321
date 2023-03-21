package day10;

public class EzenComputer {
	/* - 학생 기본정보 : 이름, 생년월일, 나이, 전화번호
	 * - 학원정보 : 학원이름 ="EZEN"(final), 지점
	 * - 수강정보 : 수강과목, 수강기간, 
	 * - 한 명의 학생은 여러과목을 수강할 수 있음
	 * 과목, 기간 =>배열로 처리 길이=5
	 * 홍길동, 990101, 20, 010-1111-1111
	 * EZEN, 인천
	 * 자바(6개월), DB(1개월), HTML(2개월)
	 * 
	 * 기능
	 * - 학생의 기본정보 출력
	 * - 학생의 학원정보 출력
	 * - 학생의 수강정보 출력
	 * - 학생의 수강정보를 추가하는 기능 매개변수로 입력받아 멤버변수로 추가
	 * */
	
	private String name;
	private int age;
	private String birth;
	private String phone;
	public final static String company="EZEN";
	private String breanch;
	private String[] course= new String[5]; //수강과목
	private String[] period= new String[5]; //수강기간
	private int cnt; //수강과목과 기간의 index처리하기 위함
	
	//생성자
	public EzenComputer() {};
	
	public EzenComputer(String name, String birth, int age, String phone, String breanch) {
		this.name=name;
		this.birth=birth;
		this.age=age;
		this.phone=phone;
		this.breanch=breanch;
	}
	
	public EzenComputer(String name, String phone, String breanch) {
		this.name=name;
		this.phone=phone;
		this.breanch=breanch;
	}
	//method
	public void printInfor() {
		System.out.println("학생 정보 >");
		System.out.println("이름:"+name);
		System.out.println("전화번호:"+phone);
		System.out.println("나이:"+age+"세");
		System.out.println("생년월일:"+birth);
	}
	public void printCompany() {
		System.out.println("학원명:"+company);
		System.out.println("지점:"+breanch);
	}
	//수강정보 출력
	public void printCourse() {//배열
		if(course.length==0||cnt==0) { //렝스가 0일 일은 잘 없음 배열이미 생성해서
			System.out.println("수강 이력이 없습니다.");
			return; //메서드의 종결 //void일때도 return이면 메서드 종결
		}
		for(int i=0;i<cnt;i++) { //추가되지않은 값은 출력 X
			System.out.print("과정:"+course[i]+"("+period[i]+") ");
		}
	}
	//수강정보 등록
	public void insertCourse(String course, String period) {
		this.course[cnt]=course;
		this.period[cnt]=period;
		cnt++; //index번지 증가
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBreanch() {
		return breanch;
	}

	public void setBreanch(String breanch) {
		this.breanch = breanch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}
	
// cnt set은 없는게 낫다.
//	public void setCnt(int cnt) {
//		this.cnt = cnt;
//	}

	public static String getCompany() {
		return company;
	}


	
	
	
	
	

}
