package t1_variable;

public class Test2 {
	public static void main(String[] args) {
		int a1=10;
		int a2=010;
		int a3=0x10;
		
		System.out.println("a3 : "+a3);
		System.out.println();
		System.out.println("출력");
		int num=10;
		
		String binaryNum = Integer.toBinaryString(num);
		String octalNum = Integer.toOctalString(num);
		String hexaNum = Integer.toHexString(num);
		
		System.out.println("2진수 hexaNum : "+hexaNum);
	}
}
