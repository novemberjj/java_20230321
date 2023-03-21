package product;

public class Order extends Product {
	private int count;
	private int total; //count*price
	
	public Order() {}
	
	public Order(int count, int total) {
		super();
		this.count = count;
		this.total = total;
	}
	public void print() {
		System.out.println(super.getName()+" "+super.getPrice()+"원");
		System.out.println(count+"개 주문 => 금액 :"+total+"원");
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	

}
