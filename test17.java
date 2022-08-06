package ex1;

import java.util.regex.Pattern;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution("102321"));
	}

	public static boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6)	// 먼저 문자 길이가 4또는 6인지 and연산을 이용해 확인한다.
		{
			String pattern = "^[0-9]*$";		// 정규식
			return Pattern.matches(pattern ,s);	// 정규식을 이용해 0~9까지의 수만 포함됐는지 확인하여 결과를 반환한다.
		}

		return false;	// 문자 길이가 4또는 6이아닐경우 바로 false를 반환한다.

		
		
		// 예외처리를 사용한 방식이다. 문자가 포함된 문자열을 parseInt할경우 예외처리가 발생하게 되는데 그때 false를 리턴하게 하는 방식이다.		
//		 if(s.length() == 4 || s.length() == 6){
//	          try{
//	              int x = Integer.parseInt(s);
//	              return true;
//	          } catch(NumberFormatException e){
//	              return false;
//	          }
//	      }
//	      else return false;
	}
}
