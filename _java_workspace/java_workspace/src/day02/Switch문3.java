package day02;

public class Switch문3 {

	public static void main(String[] args) {
		/*계절을 출력
		 * 1~12월까지 랜덤으로 생성 후 월과 계절을 출력
		 * 3~5: 봄, 6~8:여름, 9~11:가을, 12~2:겨울
		 * 
		 * case가 여러가지일 경우 case 1: case 2: case3: =>가능
		 * (1)||(2) => or 둘 다 하나의 조건만 맞으면 true
		 * (1)&&(2) => and 둘 다 맞아야 true
		 * !(true) => 조건의 반대
		 */
		
		int num = (int)(Math.random()*12)+1; //+1없으면 0~11까지 나옴
		
		switch(num) {
		case 12: case 1: case 2:
			System.out.println(num+"월은 겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println(num+"월은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println(num+"월은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(num+"월은 가을입니다.");
			break;
			}
		
		/*if(num==3||num==||num==5) {
			System.out.println(num+"월은 봄입니다.");*/
		
		/*if(num>=3&&num<=5) {
			System.out.println(num+"의 계절은 봄입니다.");*
		}*/

		
		
	}

}
