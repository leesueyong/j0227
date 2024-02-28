package t2_연산자;

public class Test2 {
	public static void main(String[] args) {
		int su=10,res;
		
		res=su/3;
		System.out.println(res);
		
		res= su % 3;
		System.out.println(res);
		System.out.println();
		
		System.out.println("10 / 3 = " + (su/3.0));
		System.out.println("10 / 3 = " + ((double)su/3.0));
	}
}
