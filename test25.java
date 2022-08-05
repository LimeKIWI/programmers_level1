package ex1;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        
        
        System.out.println(solution(a));
        
        sc.close();
    }
	public static long solution(long n) {
        double sq = Math.sqrt(n);
        if (sq%1 == 0)
        	return (long) Math.pow(sq+1, 2);
        else
        	return -1;
        
    }
}
