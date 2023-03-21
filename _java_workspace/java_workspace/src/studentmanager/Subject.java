package studentmanager;

public class Subject {
		/* class - subject (별도 생성)
		과목클래스 : 한 과목의 정보를 나타내는 클래스
		- 과목코드, 과목명, 학점, 시수, 교수명, 학기, 분류, 수업시간표
		 * */
	private String subCode;
	private String subName;
	private double subCredite;
	private int subTime;
	private String subProfessor;
	private String subSemester;
	private String subCategory;
	private String subScheduler;
	
	public Subject() {}
	public Subject(String subName) {
		this.subName=subName;
	}
	
	public Subject(String subCode, String subName, double subCredite, int subTime, String subProfessor,
			String subSemester, String subCategory, String subScheduler) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subSemester = subSemester;
		this.subCategory = subCategory;
		this.subScheduler = subScheduler;
	}
	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite + ", subTime="
				+ subTime + ", subProfessor=" + subProfessor + ", subSemester=" + subSemester + ", subCategory="
				+ subCategory + ", subScheduler=" + subScheduler + "]";
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public double getSubCredite() {
		return subCredite;
	}
	public void setSubCredite(double subCredite) {
		this.subCredite = subCredite;
	}
	public int getSubTime() {
		return subTime;
	}
	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public String getSubSemester() {
		return subSemester;
	}
	public void setSubSemester(String subSemester) {
		this.subSemester = subSemester;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	
	
	
		
		
		
		
	}


