package ex1;


public class test9 {
	public static void main(String[] args) {
		
		System.out.println(solution("01033334444"));
	}

	public static String solution(String phone_number) {
		String answer = "";
		int numberLength = phone_number.length(); // 전화번호의 총 길이를 재는 함수를 매번 참조해서 불러오는것은 실행시간에 불리하다. 하나의 값에 저장.
		for (int i = 0; i < numberLength-4; i++) {	// 전화번호의 마지막 4자리전까지만큼의 *문자열을 만든다.
			answer += "*";
		}
		
		answer += phone_number.substring(numberLength-4);	// substring함수를 사용하여 만들어진 *문자열 뒷부분에 나머지 뒷 4자리를 이어붙인다.
		
		
		return answer;
		
//		문자열을 char형식의 배열로 바꾸어 인덱스로 접근할 수 있게 만들고 수정한 방법.		
//		char[] ch = phone_number.toCharArray();
//	     for(int i = 0; i < ch.length - 4; i ++){
//	         ch[i] = '*';
//	     }
//	     return String.valueOf(ch);
		
		
//		정규식을 활용한 방법, 맨뒤 4자리를 제외한 나머지부분을 *로 채운다.
//		return phone_number.replaceAll(".(?=.{4})", "*");
	}
}
