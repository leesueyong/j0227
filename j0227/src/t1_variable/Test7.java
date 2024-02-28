package t1_variable;

public class Test7 {
	public static void main(String[] args) {
		int su1=100;
		double su2=3.14;
		su1=su1+200;
		System.out.println(su1);
		double result;
		result=su1+su2;
		System.out.println(result);
		char cc1='A';
		int res2 = cc1+1;
		System.out.println(res2);
		System.out.printf("res2 = %d\n",res2);
		System.out.printf("res2 = %c\n",res2);
		
		String ss1 = "안녕하세요!";
		System.out.println("ss1 : " + ss1);
		System.out.printf("ss1 : %s\n",ss1);
		
		double dd1=3.141592;
		System.out.printf("dd1 : %f\n",dd1);
		System.out.printf("dd1 : %.2f\n",dd1);
		System.out.printf("dd1 : %.6f\n",dd1);
		
	}
}
