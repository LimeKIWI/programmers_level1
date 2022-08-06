package ex1;


public class test7 {
	public static void main(String[] args) {
        
        int[] arr1 = {4,7,12};
        boolean[] arr2 = {true,false,true};
        
        System.out.println(solution(arr1, arr2));
       
    }
	public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++) {
        	
        	// 삼항 연산자 사용해서 넣기 (조건)? 참일경우(정수값그대로더하기) : 거짓일경우(정수값앞에-를 붙이고 정수로 형변환)
        	answer += (signs[i]) ? absolutes[i] : Integer.parseInt("-"+absolutes[i]);  
        }
        
        return answer;
    }
}
