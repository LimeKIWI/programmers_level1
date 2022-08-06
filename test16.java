package ex1;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("pPoooyY"));
	}
	public static boolean solution(String s) {
        s = s.toLowerCase();	// 문자열에 섞인 대문자를 소문자로 모두 바꿔준다.
        
        // 자바8의 람다식을 활용한 방식, 문자열속에 p만을 필터링해 몇개있는지 세어보는 구문이다.
        long count1 = s.chars().filter(ch -> ch == 'p').count();
        // 자바8의 람다식을 활용한 방식, 문자열속에 y만을 필터링해 몇개있는지 세어보는 구문이다.
        long count2 = s.chars().filter(ch -> ch == 'y').count();
              
        return count1 == count2 ? true : false;	// 두 카운트 값이 같은지 다른지에 따라 true와 false를 반환한다.
    }
}
