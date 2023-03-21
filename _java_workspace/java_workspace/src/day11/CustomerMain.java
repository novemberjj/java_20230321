package day11;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer[] customerlist= new Customer[10];
		//업캐스팅 => 묵시적인 형변환이 가능
		Customer c= new Customer(10001, "홍길동");
		Customer g= new GoldCustomer(10002, "홍길순");
		Customer v= new VipCustomer(10003,"홍길길",6546546);
		
		//다운캐스팅 => 반드시 명시적으로 형변환 해야함.
		//instanceof : 원래 인스턴스의 형이 맞는 여부를 체크하는 명령어 true/false
		if(v instanceof VipCustomer) {
			VipCustomer vCustomer =(VipCustomer)v;
			System.out.println(vCustomer.getAgentID());
		}else if(v instanceof GoldCustomer) {
			GoldCustomer vCustomer=(GoldCustomer)v;
			vCustomer.getSaleRatio();
		}else {
			System.out.println("error");
		}
		System.out.println(v instanceof GoldCustomer);
		
		//VipCustomer vCustomer= (VipCustomer)v; //원래 내 vip의 객체로 돌아온 것임
		//다운캐스팅을 해야지만 할 수 있음
		//System.out.println(vCustomer.getAgentID());
		
		//업캐스팅 -> 다운캐스팅 가능
		
		
		int cnt=0;
		customerlist[cnt]=c;
		cnt++;
		customerlist[cnt]=g;
		cnt++;
		customerlist[cnt]=v;
		cnt++;
		
		System.out.println("--- 고객 정보 출력 ----");
		//for문을 활용해서 고객정보 출력
		for(int i=0;i<cnt;i++) {
			System.out.println(customerlist[i].customerInfo());
		}
		
		System.out.println("---할인율과 포인트 계산 ---");
		int price=100000;
		//for문을 활용하여 할인율과 포인트 계산 내역 출력
		for(int i=0;i<cnt;i++) {
			int cost=customerlist[i].calcPrice(price);
			System.out.println(customerlist[i].getCustomerName()+"님이 지불하실 금액은 "+cost+"원 입니다.");
			System.out.println(customerlist[i].getCustomerName()+"님의 현재 포인트는 "+customerlist[i].bonusPoint+"점 입니다.");
		}
		
//		Customer c= new Customer();
//		c.customerInfo();
////		System.out.println(c.calcPrice(1000));
//		//c.calcPrice(10000);
//		System.out.println(g.customerInfo());
		
//		
//		
//		System.out.println("===== 할인율과 보너스 계산 ====");
//		int price = 100000;
//		int cost=c.calcPrice(price);
//		System.out.println(c.getCustomerName()+"님이 지불하실 금액은 "+cost+"원 입니다.");
//		System.out.println(c.getCustomerName()+"님의 현재 포인트는 "+c.bonusPoint+"점 입니다.");
//		int cost1=g.calcPrice(price);
//		System.out.println(g.getCustomerName()+"님이 지불하실 금액은 "+cost1+"원 입니다.");
//		System.out.println(g.getCustomerName()+"님의 현재 포인트는 "+g.bonusPoint+"점 입니다.");
//		int cost2=v.calcPrice(price);
//		System.out.println(v.getCustomerName()+"님이 지불하실 금액은 "+cost2+"원 입니다.");
//		System.out.println(v.getCustomerName()+"님의 현재 포인트는 "+v.bonusPoint+"점 입니다.");
//		
//		
//		System.out.println(v.customerInfo());
//		
		
		
	

	}

}
