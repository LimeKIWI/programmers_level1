package ex1;


public class test15 {

	public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
                           	
        System.out.println(solution(a, b));
       
    }
	
	public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0; i < a.length; i++)	// 두 배열이 한번에 같은 레벨의 인덱스를 참조하므로 인덱스를 가진 반복문 하나만 사용하면 된다.
        	answer += a[i]*b[i];			// 각 배열의 같은 인덱스의 값을 서로 곱한값을 매번 더한다.
        return answer;
    }
}

