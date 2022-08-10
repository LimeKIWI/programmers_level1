package ex1;

public class test47 {
	public static void main(String[] args) {
		System.out.println(solution(10000));
	}

	// 에라토스테네스의 채 사용해야함
	public static int solution(int n) {
		int answer = 0;
		boolean[] flag = new boolean[n+1];

		flag[0] = flag[1] = true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (!flag[i]) {
				int isNum = 0;
				for (int j = 2; j <= i; j++) {
					if (i % j == 0)
						isNum++;
					if (isNum > 1)
						break;
				}
				if (isNum == 1) {
					for (int j = i*2; j <= n; j += i) {
						flag[j] = true;
					}
				}
				isNum = 0;
			}
		}
		
		for (int i = 2; i <= n; i++)
		{
			if(!flag[i]) {
				answer++;
			}
		}

		return answer;
	}
}
