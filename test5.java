package ex1;

import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        
        	System.out.println(solution(a));
       
    }

	public static int solution(String s) {
		int answer = Integer.parseInt(s);
		return answer;
	}

}
