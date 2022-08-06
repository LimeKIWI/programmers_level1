package ex1;

public class test27 {
	
	public static void main(String[] args) {
             
        	System.out.println(solution(15));
        
    }

	 public static int solution(int num) {
	        int answer = 0;
	        long number = num;
	        
	        while(answer < 500 && number != 1) {	// 연산횟수가 500번이 되거나 1이 된다면 반복이 종료된다.
	        	if(number%2==0)						// 수가 짝수라면
	        		number /= 2;					// 2로나눈다
	        	else								// 홀수라면
	        		number = (number*3)+1;	     	// 3으로곱한값에 1을 더한다.
	        	answer++;							// 연산횟수+1
	        }
	        
	        return number == 1 ?  answer : -1;		// 1이 되는것에 성공한다면 몇번 시도했는지 반환, 실패했다면 -1을 반환
	    }
}
