package day12;

public class Exception04 {

	public static void main(String[] args) {
		/* try{
		 * 코드
		 * }catch(에외클래스명 객체){
		 * 처리문;
		 * }catch(예외클래스명2 객체){
		 * 처리문;
		 * }catch(예외클래스명3 객체){
		 * 처리문;
		 * }
		 * */
		
		double res=0;
		
		try {
			//res=1/0;
			//int arr[]=null;
			
			int arr[]=new int[3];
			arr[5]=10;
			
		} catch (ArithmeticException | NullPointerException e) {//|가능
			System.out.println("에외발생");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("배열 범위가 넘어갔습니다.");
		}catch(Exception e) { //항상 마지막에 위에 넣으면 나머지 애들 다 걸림 default느낌
			e.printStackTrace();
		}
		System.out.println("종료");
	}

}
