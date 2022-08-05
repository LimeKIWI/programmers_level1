package ex1;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String solution(int n) {
		String answer = "";
		StringBuilder sb = new StringBuilder();
		if (n == 0)
			return answer;
		else if (n == 1)
			return "수";
		else {

			for (int i = 0; i < n / 2; i++) 
				sb.append("수박");
			answer = sb.toString();

			return n%2 == 0 ? answer : answer+"수";
		}
	}
}
