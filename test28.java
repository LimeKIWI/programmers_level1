package ex1;

import java.util.Scanner;

public class test28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		

		System.out.println(solution(a));
	}

	public static boolean solution(int x) {
		boolean answer = false;
		int sum = 0;
		String s = Integer.toString(x);
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		if(x%sum == 0)
			return true;
		
		return answer;
	}

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
