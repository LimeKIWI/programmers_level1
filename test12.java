package ex1;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(3, 20, 4);
		
	}

	public static long solution(int price, int money, int count) {
		long answer = 0;
		while (count > 0) {
			answer += price*count;
			count--;
		}
		answer = answer-money;
		
		
		return (answer > 0) ? answer : 0;
		
//		return Math.max(price * (count * (count + 1) / 2) - money, 0);
	}
}
