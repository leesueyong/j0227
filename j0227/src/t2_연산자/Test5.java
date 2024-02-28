package t2_연산자;

// 점수가 60점 이상은 '합격', 60점 미만은 '불합격'이라고 출력하시오(String 변수에 담아서 출력하시오.).
public class Test5 {
	public static void main(String[] args) {
		String res;
		int jumsu=70;
		res=(jumsu>=60) ? "합격" : "불합격";
		System.out.println(res);
	}
}
