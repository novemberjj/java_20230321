package day16;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerMain {

	public static void main(String[] args) {
		ArrayList<Customer> customer = new ArrayList<>();
		
		customer.add(new Customer("이순신", 40));
		customer.add(new Customer("신사임당", 35));
		customer.add(new Customer("이아들", 10));
		
		System.out.println("--고객 명단--");
		customer.stream().forEach(a->System.out.println(a.getName()+" "+a.getAge()+"세 비용:"+a.getCost()+"만원"));
		//customer.stream().forEach(a->System.out.println(a.toString()));
//		customer.stream().forEach(a->{
//			String name= a.getName();
//			int age =a.getAge();
//			int cost= a.getCost();
//			
//			System.out.println("이름:"+name+", 나이:"+age+", 비용:"+cost+"만원");
//		});
		
		int sum= customer.stream().mapToInt(a->a.getCost()).sum();
		System.out.println("총 여행비용:"+sum+"만원");
		//20세 이상 성인만 이름을 정렬하여 출력
		customer.stream().filter(a->a.getAge()>=20).map(a->a.getName()).sorted().forEach(System.out::println);
		
		customer.stream().filter(a->a.getAge()>=20).sorted(new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		}).forEach(a->System.out.println(a.toString()));
		
		

	}

}
