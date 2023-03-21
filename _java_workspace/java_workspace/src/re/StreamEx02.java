package re;

import java.util.Arrays;

public class StreamEx02 {

	public static void main(String[] args) {
		/* 배열에서 짝수만 출력(정렬).filter().sorted()
		 * 중복되는 값은 삭제.distinct()
		 * */
		int arr[]= {5,6,1,3,5,1,7,8,6,4,2,8,4};
		Arrays.stream(arr).filter(a->a%2==0).distinct().sorted().forEach(System.out::println);
		System.out.println("---------");
		
		int arr2[]= Arrays.stream(arr).distinct().filter(a->a%2==0).sorted().toArray();
		//Arrays.stream(arr2).sorted().forEach(System.out::println);
		for(int tmp : arr2) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		int sum = Arrays.stream(arr).reduce(1,(a,b)-> a*b);
		System.out.println(sum);

		
	}

}
