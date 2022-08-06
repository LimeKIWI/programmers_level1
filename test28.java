package ex1;

import java.util.Scanner;

public class test28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		

		System.out.println(solution(a));
		sc.close();
	}

	public static boolean solution(int x) {
		boolean answer = false;				// 기본적으로 하사드 수가 아니라고 설정함.
		int sum = 0;
		String s = Integer.toString(x);		// 숫자를 문자열(배열처럼 사용가능)로 변환한다.
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';		// 문자열의 각 값을 charAt(문자열의 몇번째 글자)을 이용해 가져와서 더한다.
											// 이때 char타입은 그대로 저장한다면 Ascii코드의 char 문자의값이 저장되므로 char형 '0'을 빼서 제대로 정수숫자값으로 맞춰준다.
		}
		if(x%sum == 0)						// x를 각 자릿수를 더한값으로 나누어 나머지가 없을때
			return true;					// 하사드 수이다.
		
		return answer;						// 하사드 수가 아니다.
	}

	// 모듈러를 이용하여 각 자리를 가져오도록 구현된 답변.
//	public class HarshadNumber{
//	    public boolean isHarshad(int num){
//	int mod=num;
//	int calc=0;
//	do{
//	 calc+=(mod%10);
//	mod=mod/10;
//	}while(mod%10 > 0);
//
//	        return (num%calc == 0) ? true:false;//or fralse
//	    }
//	}
}
