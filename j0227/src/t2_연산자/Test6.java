package t2_연산자;

import java.util.Scanner;

// 점수가 60점 이상은 '합격', 60점 미만은 '불합격'이라고 출력하시오(String 변수에 담아서 출력하시오.).
public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String res;
		int jumsu;
		
		System.out.print("점수를 입력하시오.");
		jumsu= sc.nextInt();
		
		res=(jumsu>=60) ? "합격" : "불합격";
		System.out.println(res);
		
		sc.close();
	}
}
