package ex1;

public class test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " a b D E";
		solution(str, 25);

	}

	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				c += n;
				if (Character.isLowerCase(s.charAt(i))) {
					if (c > 'z') {
						c -= 26;
					}
				} 
				else {
					if (c > 'Z') {
						c -= 26;
					}
				}

			}
			answer += ("" + c);
		}

		return answer;
	}
}
