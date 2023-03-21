package day11;

public class VipCustomer extends Customer {
	double saleRatio;
	private int agentID;
	
	public VipCustomer() {}
	
	public VipCustomer(int id, String name, int agentID) {
		super(id,name);
		customerGrade="Vip";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint+=(int)(price*bonusRatio);
		return price-(int)(price*saleRatio);
	}

	@Override
	public String customerInfo() {
		
		return super.customerInfo()+"담당 상담원 번호는 "+agentID+"입니다.";
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	

	
		
	}
	


