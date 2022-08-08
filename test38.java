package ex1;

public class test38 {
	public static void main(String[] args) {

		// 반복수만큼 *을 출력
		System.out.print(solution("23four5six7"));

	}

	public static int solution(String s) {
//		String answer = "";
//		StringBuilder sb = new StringBuilder();
//		String[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
//		String[] str = s.split("");
//
//		for (int i = 0; i < str.length; i++) {
//			if (str[i].charAt(0) >= '0' && str[i].charAt(0) <= '9')
//				answer += str[i];
//			else {
//				sb.append(str[i]);
////				System.out.println(sb.toString());
//				for (int j = 0; j < word.length; j++) {
//					if (sb.toString().equals(word[j])) {
//						answer += j;
//						sb = new StringBuilder();
//						break;
//					}
//				}
//			}
//		}
//
//		return Integer.parseInt(answer);
		String[] word = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
		
		for(int i = 0; i < word.length; i++) {
			s = s.replaceAll(word[i], num[i]);
		}
		
		return Integer.parseInt(s);
		
	}
}
