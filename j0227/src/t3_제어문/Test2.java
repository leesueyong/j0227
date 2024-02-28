package t3_제어문;

import java.util.Scanner;

//점수가 60점 이상이면 합격 미만이면 불합격 
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		int jumsu=sc.nextInt();
		String res="";
		if(jumsu>=60) {
			res="합격";
		}
		else {
			res="불합격";
		}
		System.out.println(res);
	}
}
