package t2_연산자;

public class Test1 {
	public static void main(String[] args) {
		int su=0;
		su++;
		System.out.println(su);
		
		int res=0;
		res = su;
		System.out.println("su : "+su+", res : "+res);
		
		res = su++ + 10; 
		System.out.println(su);
		System.out.println(res);

		res = --su + 10; 
		System.out.println(su);
		System.out.println(res);
	}
}
