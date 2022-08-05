package ex1;

import java.util.Scanner;

public class test22 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        
        System.out.println(solution(a));
        
    }
	
	public static int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        while(n > 0)
        {
        	answer+=n%10;
        	n /= 10;
        }

        return answer;
    }
}
