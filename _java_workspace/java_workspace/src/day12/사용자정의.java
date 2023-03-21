package day12;

public class 사용자정의 {

	public static void main(String[] args) {
		/* PasswordException
		 * public RuntimeException(String message) {
        super(message);
        */
		/* -비밀번호는 null일 수 없다.
		 * -비밀번호의 길이는 5자이상
		 * -문자로만 이루어지면 안됨 문자+숫자나 특수문자포함
		 *  
		 * */
		PasswordTest pt= new PasswordTest();
		String password="abcef!g";
//		String password=null;//입력안함
//		String password="abc"; //길이 에러
//		String password="abcdef"; //숫자나 문자포함 안함

		
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

	}

}
class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if(password==null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		}else if(password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}else if(password.matches("[a-zA-Z]+")){
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		this.password = password;//다 통과해야 설정해준다
	}
	
	
}