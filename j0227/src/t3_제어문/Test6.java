package t3_제어문;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		String str="";
		if(num>0) str="양수";
		else if (num<0) str="음수";
		else str="0";
		System.out.println(str);
		sc.close();
	}
}
