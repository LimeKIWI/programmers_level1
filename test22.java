package ex1;

import java.util.Scanner;

public class test22 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        
        System.out.println(solution(a));
        sc.close();
        
    }
	
	public static int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        while(n > 0)		// 간단하게 n이 0이 될때까지 숫자하나하나를 받아오는 연산을 한다.
        {
        	answer+=n%10;	// n의 값을 10으로 모듈러 연산을 한다면 1의자리의 숫자가 나온다. 123 => 3
        	n /= 10;		// n의 값을 10으로 나누어 1의 자리를 없앤다. 123 => 12
        }

        return answer;
    }
}
