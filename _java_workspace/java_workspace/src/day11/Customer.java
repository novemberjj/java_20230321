package day11;

public class Customer {
	/* 일반고객 / Gold고객 / VIP고객
	 * 
	 * 고객 ID : customerID
	 * 고객 이름 : customerName
	 * 고객 등급 : customerGrade
	 * 보너스 포인트 : bonusPoint
	 * 보너스 포인트 비율 : bonusRatio
	 * 
	 * - Customer 객체생성시
	 * 기본 customerGrade= Silver
	 * 기본 bonusRatio = 0.01
	 * 
	 * - Gold 등급
	 *   제품을 살때 10%을 할인 / 보너스 포인트 2%적립
	 *   
	 * - VIP 등급
	 * - 제품을 살때 10% 할인 / 보너스 5%적립
	 * - 전담상담사
	 * 
	 * - 메서드 
	 * - 보너스 적립 계산(calcPrice(int price))
//	 * => 보너스를 적립하고, 할인여부를 체크하여 구매 price를 리턴
//	 * - 구매금액을 주고, 적립 보너스를 계산 bonusPoint에 누적
//	 * 
//	 * - 출력메서드(메서드명 : customerInfo())
//	 * - 홍길동 님의 등급은 VIP이며, 보너스 포인트는 1000 입니다.
//	 * 
//	 * */

	protected int customerID; //고객아이디
	protected String customerName; //고객명
	protected String customerGrade; //고객등급
	int bonusPoint; //포인트
	double bonusRatio; //포인트 적립비율
	
	public Customer() {} //기본생성자 주는 이유 : 상속받는 애들도 비어있는 객체를 상속 받을 수 있음
	
	public Customer(int id, String name) {
		customerID=id;
		customerName=name;
		initCustomer();
//		customerGrade="Sliver";
//		bonusRatio=0.01;
	}
	
	private void initCustomer() {
		customerGrade="Silver";
		bonusRatio=0.01;
	}
	
	public int calcPrice(int price) {
		//가격을 매개변수로 받아 포인트를 적립
		bonusPoint=(int) (bonusPoint+(price*bonusRatio));
		return price;
	}
	
	public String customerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint +"입니다.";
	}
	
//	public void customerInfo() {
//		System.out.println(customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는 "+bonusPoint+"입니다.");
//	}
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	//bonus는 직접 접근 가능해서 getter setter 안필요함
	
}
	
