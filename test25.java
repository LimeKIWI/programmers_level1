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
        double sq = Math.sqrt(n);		// 먼저 Math클래스의 제곱근메소드 sqrt를 사용한다.
        if (sq%1 == 0)					// 만약 sqrt한 결과가 소숫점이 없다면 (실수를 1로 모듈러 연산할경우 소숫점이하만남게됨, 정수를 1로 모듈러연산하면 항상 0)
        	return (long) Math.pow(sq+1, 2);	// 해당 제곱근값을 제곱(pow)(값, 2제곱)
        else
        	return -1;					// 제곱근한 값이 실수라면 -1반환
        
    }
}
