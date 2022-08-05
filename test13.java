package ex1;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        	        
	        while(true){
	        	int a = sc.nextInt();
		        int b = sc.nextInt();
	    		System.out.println(solution(a, b));
	        }
		
	}

	public static String solution(int a, int b) {
		String answer = "";
							//31, 29, 31, 30,   31,  30,  31,  31,  30,  31,  30,  31
		int[] countDays = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};	
		String[] dayName = {"THU","FRI","SAT","SUN","MON","TUE","WED"};			
		
		
		int s2 = countDays[a-1];
		int ss= countDays[a-1]+b;
		
		int s = (countDays[a-1]+b)%7;
		answer = dayName[s];
		
		
		
		return answer;
	}

}
