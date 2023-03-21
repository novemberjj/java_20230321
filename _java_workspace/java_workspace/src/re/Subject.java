package re;

public class Subject {
	/* 과목클래스 : 한 과목의 정보를 나타내는 클래스
	 * - 과목코드, 과목명, 학점, 시수, 교수명, 학기, 분류, 수업시간표
	 * */
	private int subCode;
	private String subName;
	private double subCredite;
	private int sub;
	private String professor;
	private int semester;
	private String category;
	private int subTime;
	
	public Subject() {}
	
	public Subject(int subCode, String subName, double subCredite, int sub, String professor, int semester,
			String category, int subTime) {
		super();
		this.subCode = subCode;
		this.subName = subName;
		this.subCredite = subCredite;
		this.sub = sub;
		this.professor = professor;
		this.semester = semester;
		this.category = category;
		this.subTime = subTime;
	}

	@Override
	public String toString() {
		return "Subject [subCode=" + subCode + ", subName=" + subName + ", subCredite=" + subCredite + ", sub=" + sub
				+ ", professor=" + professor + ", semester=" + semester + ", category=" + category + ", subTime="
				+ subTime + "]";
	}

	public int getSubCode() {
		return subCode;
	}

	public void setSubCode(int subCode) {
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

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}
	
	
	
	
	
	

}
