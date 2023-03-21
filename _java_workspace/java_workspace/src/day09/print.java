package day09;

public class print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Card c= new Card();
		c.print();
		c.setNum(11);
		c.setShape('!');
		c.print();
		
		CardPack p= new CardPack();
		Card[] pack=new Card[52];
		Card d= new Card();
		
		
		
		p.shuffle();
		p.pick();
		
		
		

	}

}
