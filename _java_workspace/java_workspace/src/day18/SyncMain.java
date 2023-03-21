package day18;

class Bank{
	//계좌의 돈
	private int money=10000;
	//입금
	public synchronized void saveMoney(int save) { //동기화시켰다 : 어떤 객체가 savemoney에 접근하면 savemoney가 끝날때까지 bank클래스에 접근을 막음.
		int m=this.money;
		
		try {
			Thread.sleep(3000); //3초 후 실행
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m+save);
		
	}
	//출금
	public synchronized void minusMoney(int minus) {
		int m=this.money;
		
		try {
			Thread.sleep(200); //0.2초 후 실행
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setMoney(m-minus);
	}
	
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
class Hong extends Thread{
	public void run(){ //입금
		System.out.println("입금 시작");
		SyncMain.myBank.saveMoney(3000); //3000원 입금
		System.out.println("3천원 입금 후 : "+SyncMain.myBank.getMoney());
	}
	
}
class HongWife extends Thread{
	public void run() { //출금
		System.out.println("출금 시작");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("1천원 출금 후 : "+SyncMain.myBank.getMoney());
	}
	
}


public class SyncMain {
	
	public static Bank myBank = new Bank(); //공유영역 설정

	public static void main(String[] args) {
		Hong h = new Hong();
		h.start(); //Thread를 상속받아서 바로 start가능
		
		
		HongWife hw = new HongWife();
		hw.start();
		
	}

}
