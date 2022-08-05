package ex1;

import java.util.regex.Pattern;

public class test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(solution("102321"));
	}

	public static boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6)
		{
			String pattern = "^[0-9]*$";
			return Pattern.matches(pattern ,s);
		}

		return false;
		
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
