package day12;

public class 과제 {

	public static void main(String[] args) {
		/* Tv의 채널은 0~10 채널은 순환구조
		 * vol 0~20까지 0이되면 음소거
		 * vol 0이하로 내려가지 않음 20이상 올라가지 않음
		 * */
		
		Tvv t= new Tvv();
		t.powerOn();
		t.setCh(9);;
		t.channelUp();
		t.channelUp();
		t.channelUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.setVol(0);
		t.volDown();
		t.setCh(0);;
		t.channelDowon();
		t.channelDowon();
		t.setVol(1);;
		t.volDown();
		t.volDown();
	}

}
interface remocon{
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDowon();
	void volUp();
	void volDown();
	
}

class Tvv implements remocon{
	private int ch;
	private int vol;
	private boolean power;

	@Override
	public void powerOn() {
		System.out.println("Tv가 켜졌습니다.");
		power=true;
		
	}

	@Override
	public void powerOff() {
		System.out.println("Tv가 꺼졌습니다.");
		power=false;
		
	}

	@Override
	public void channelUp() {
		if(power) {
			ch++;
			if(ch>10) {
				ch=0;
			}
				System.out.println("채널:"+ch);
		}else {
			System.out.println("Tv가 꺼져있습니다.");
			}
			
		}
		
	

	@Override
	public void channelDowon() {
		if(power) {
			ch--;
			if(ch<0) {
				ch=10;
			}
				System.out.println("채널:"+ch);
		}else {
			System.out.println("Tv가 꺼져있습니다.");
			}
		}
		
	

	@Override
	public void volUp() {
		if(power) {
			vol++;
			if(vol>20) {
				vol=20;
			}
			System.out.println("볼륨:"+vol);
		}else {
			System.out.println("전원을 켜주세요.");
		}
		
		
	}

	@Override
	public void volDown() {
		if(power) {
			vol--;
			if(vol<=0) {
				vol=0;
				System.out.println("음소거");
		}else {
			System.out.println("볼륨:"+vol);
		}
	}else {
		System.out.println("전원을 켜주세요.");
		
	}
		
	}
		
		
	


	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
}