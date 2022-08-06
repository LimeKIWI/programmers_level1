package ex1;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(solution(3, 20, 4));
		
	}

	public static long solution(int price, int money, int count) {
		long answer = 0;
		// 먼저 드는 비용을 계산한다 카운트가 0이 될때까지 놀이기구를 탄다.
		while (count > 0) {
			answer += price*count;	// 가격 * 횟수(카운트) = 횟수만큼 할증된 금액, 최대카운트부터 반복을 하기때문에 최대할증금액에서 기본금액까지 역순으로 더하게 된다.
			count--;	// 카운트 감소
		}
		answer = answer-money;	// 최종청구금액-가진금액을 뺀다.
				
		return (answer > 0) ? answer : 0;	// 결과값이 0보다 크다면(돈이 부족하다면) 결과값 반환, (돈이 넉넉하다면) 아니라면 0을 반환한다.
	
//		Math의 max함수를 이용한 풀이.
//		return Math.max(price * (count * (count + 1) / 2) - money, 0);
	}
}
