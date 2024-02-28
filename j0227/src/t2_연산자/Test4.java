package t2_연산자;

public class Test4 {
	public static void main(String[] args) {
		char res;
		int jumsu = 55;
		
		res = (jumsu>=90) ? 'A' : (jumsu>=80) ? 'B' : (jumsu>=70) ? 'C' :(jumsu>=60) ? 'D' : 'F';
		System.out.println("점수 : "+jumsu+"은 "+res+" 학점입니다.");
	}
}
