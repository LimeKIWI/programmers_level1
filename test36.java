package ex1;

import java.util.ArrayList;
import java.util.Comparator;

public class test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("Zbcdefg"));

	}
	
	public static String solution(String s) {
        String answer = "";
        ArrayList<Integer> list = new ArrayList<Integer>();
                   
        for(int i = 0; i < s.length(); i++) {
        	int w = s.charAt(i);
        	list.add(w);
        }
                
// 		String[] arry = str.split(""); 이런식으로도 문자열을 쪼갤수있음
//      Arrays.sort(arry,  Collections.reverseOrder());
        list.sort(Comparator.reverseOrder());
        
        for(int l : list) {
        	answer += (char)l;
        }
        
        return answer;
        
        
    }
}
