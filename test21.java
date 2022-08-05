package ex1;

import java.util.Scanner;

public class test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();

		System.out.println(solution(a));
	}

	public static String solution(String s) {
		String answer = "";
		s = s.toLowerCase();
		String[] words = s.split(" ", -1);
		
		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				if(i%2 != 0) 
					answer += (""+word.charAt(i));
				else
					answer += (""+word.charAt(i)).toUpperCase();
			}
			answer += " ";
		}
				
		;
		return answer.substring(0, answer.length() - 1);
	}
	
//	public String solution(String s) {
//        char[] chars = s.toCharArray();
//        int idx = 0;
//
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == ' ')
//                idx = 0;
//            else
//                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
//        }
//
//        return String.valueOf(chars);
//  }

}
