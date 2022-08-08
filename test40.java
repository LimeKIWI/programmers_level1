package ex1;


public class test40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
	}
	public static String solution(String new_id) {
        
        String regex1 = "[^a-z0-9-_.]*";				// 소문자,숫자,-,_,. 이외 제거 정규식
        String regex2 = "[.]{2,}";						// 점 두개이상 붙어있을때 제거 정규식
        String regex3 = "^[.]|[.]$";					// 앞뒤 점 제거 정규식
        String regex4 = "[.]$";							// 뒤에 점이 있을시에 제거 정규식

        new_id = new_id.toLowerCase();					// 소문자로 전부 변경
        new_id = new_id.replaceAll(regex1, "");			// 소문자,숫자,-,_,.이외 제거
        new_id = new_id.replaceAll(regex2, ".");		// 점이 두개이상 나란히 있을시 제거
        new_id = new_id.replaceAll(regex3, "");			// 앞 뒤점 제거
        
        if(new_id.equals(""))							// 공백일때 a넣기
        	new_id = "a";
        if(new_id.length() > 15) {						// 16글자 이상일때 자르기
        	new_id = new_id.substring(0, 15);
        	new_id = new_id.replaceAll(regex4, "");		// 맨뒤 점이면 제거
        }
        if(new_id.length() <= 2)	{					// 글자수 2글자 이하면 3글자 맞춰주기
        	for(int i = new_id.length(); i < 3; i++) {
        		new_id += new_id.charAt(new_id.length()-1);
        	}
        }
        	       
        return new_id;
    }
}
