package ex1;

public class test46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10));
	}
	public static int solution(int n) {
        int answer = 0;
        for(int i = 2; i < n; i++) {
        	if(n%i == 1)	{
        		answer = i;
        		break;
        	}
        }
        return answer;
    }
}
