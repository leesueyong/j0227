package t2_연산자;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char res;
		int jumsu;
		
		System.out.print("점수를 입력하시오. ");
		jumsu=sc.nextInt();
		res=(jumsu>=90) ? 'A' : (jumsu>=80) ? 'B' : (jumsu>=70) ? 'C' : (jumsu>=60) ? 'D' : 'F';
		System.out.println("학점은 "+res);
	}
}
