package day09;

public class CardPack {
	
	/* CardPack클래스
	 * - 카드팩 52장의 카드를
	 * 
	 *  - 카드를 섞는 기능
	 *  - 한장을 선택하는 기능
	 *  - 카드 초기화 기능
	 *  - 출력기능 - card클래스에서 가져오기
	 *  - 생성자 -52장의 카드를 모두 생성 배열에 저장
	 *  카드팩을 담을 수 있는 카드 배열 생성
	 * */
	
	
	//멤버변수
	//카드를 담을 수 있는 배열 52장
	private Card[] pack = new Card[52];//카드팩 배열
	private int cnt=0;//카드가 남은 개수
	
	//카드 섞기 기능
	//메서드명 : shuffle
	//Card tmp
	
	//멤버변수는 매개변수로 넣지 않음
	public void shuffle() { //배열의 번지가 몇 번지이든지 상관없이 섞고 싶음
		int min=0;
		int max=pack.length-1;
		
		for(int i=0;i<pack.length;i++) {
			int r=(int)(Math.random()*(max-min+1))+min;
			Card tmp=pack[i];
			pack[i]=pack[r];
			pack[r]=tmp;
			
		}
	}
		//카드를 한 장 빼내는 기능
	//메서드명 :pick
	//리턴타입 : 카드1장
	//cnt=52가정
		public Card pick() { //멤버변수는 매개변수로 넣지않아도 안다
			if(cnt==0) {
			return null;//객체가 없는 null을 리턴 0은 숫자(int)라 리턴 못함
			}
			cnt--;
			return pack[cnt];// pack[pack.length-1];//카드는 뽑으면 줄어든다
		}
		
		//초기화
		public void init() {
		//	cnt=52; //그냥 채우기
			//정리해서 새로 만들어 놓기
			cnt=0;
			char shape='♥';
			for(int i=1;i<=4;i++) {
				switch(i) {
				case 1: shape='♥';
						break;
				case 2: shape='◆';
						break;
				case 3: shape='♠';
						break;
				case 4: shape='♣';
						break;
				}
				for(int j=1;j<=13;j++) {
					Card c=new Card(); //카드 한장 생성
					c.setShape(shape);
					c.setNum(j); //cnt번지라고 생각
					pack[cnt]=c; //shape='♥'
					cnt++;
				}
			}
		}
		

		public Card[] getPack() {
			return pack;
		}

		public void setPack(Card[] pack) {
			this.pack = pack;
		}
		
		//생성자 => 52장의 카드를 생성
		public CardPack() {
			//♥ ◆ ♠ ♣
			char shape='♥';
			for(int i=1;i<=4;i++) {
				switch(i) {
				case 1: shape='♥';
						break;
				case 2: shape='◆';
						break;
				case 3: shape='♠';
						break;
				case 4: shape='♣';
						break;
				}
				for(int j=1;j<=13;j++) {
					Card c=new Card(); //카드 한장 생성
					c.setShape(shape);
					c.setNum(j); //cnt번지라고 생각
					pack[cnt]=c; //shape='♥'
					cnt++;

					
					
				}
				
			}
			
			
		}
		

	
	

}
