package day09;

public class CardPackMain {

	public static void main(String[] args) {
		/* 카드 생성
		 * 
		 * */
		
		Card c= new Card();
		c.print();
		
		CardPack cp= new CardPack();
		//Card tmp=cp.pick(); //가장 위에 있는 카드 한장을 pick 해서 pick Card객체에 저장
		//Card tmp =cp.pick();
		
		System.out.println();
		
		//tmp.print();
		
		//모양대로 4열횡대
		//한 모양이 끝나면 줄바꿈
		
		cp.shuffle();
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=13;j++) {
//				Card a=cp.pick();
//				a.print();
				Card tmp=cp.pick(); //위 아래 같은거임
				tmp.print();
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		cp.init();
		
		for(int i=0;i<52;i++) {
			if(i%13==0&&i!=0) {
				System.out.println();
			}
			Card b= cp.pick();
			b.print();
		}
		System.out.println();
		System.out.println("------------------------");
		
		//cp.init();
		//cp.shuffle();
		//cp.pick().print();
		System.out.println();
		System.out.println("----------------------");
		cp.init();
		cp.shuffle();
		a: for(int i=1;i<=4;i++) {
			for(int j=1;j<=13;j++) {
				Card d=cp.pick() ;
				if(d!=null) {
					d.print();
				}else {
					System.out.println("카드가 없습니다. 초기화하세요.");
					break a;
				}
			}
			System.out.println();
		}
	
		
		
	}

}
