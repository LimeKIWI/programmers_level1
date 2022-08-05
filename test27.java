package ex1;



public class test27 {
	
	public static void main(String[] args) {
        
        
        	System.out.println(solution(15));
        
    }

	 public static int solution(int num) {
	        int answer = 0;
	        long number = num;
	        
	        while(answer < 500 && number != 1) {
	        	if(number%2==0)
	        		number /= 2;
	        	else
	        		number = (number*3)+1;	     
	        	answer++;
	        }
	        
	        return number == 1 ?  answer : -1;
	    }
}
