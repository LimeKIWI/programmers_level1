package ex1;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        	        
	        while(true){
	        	int a = sc.nextInt();
		        int b = sc.nextInt();
	    		System.out.println(solution(a, b));
	        }
	        
	}

	public static String solution(int a, int b) {
		String answer = "";
							// 모든 개월의 누적일수를 저장한 배열(이 값은 입력을 받지않고, 또한 변하지않으며 자주쓰이므로 생성
							//31, 29, 31, 30,   31,  30,  31,  31,  30,  31,  30,  31
		int[] countDays = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};	
							// 쉽게 요일을 참조하기 위한 요일 배열
		String[] dayName = {"THU","FRI","SAT","SUN","MON","TUE","WED"};			
		
				
		int s = (countDays[a-1]+b)%7;	// countDays[a-1]: a라고 입력받은 달의 누적 일수를 알기위한 값, 배열의 인덱스는 0부터 시작하므로 -1
										// +b: 해당 월에 추가적으로 지나간 일수를 더해서 최종 누적일수를 구한다.
										// 누적일수를 요일만큼 나눔으로써 어느요일인지 알 수 있게 된다.
		answer = dayName[s];			// 요일배열을 참조하여 결과생성 : 이 경우 요일배열에 값이 어느 순서로 잘 들어가 있는지가 제대로 된 값이 나오는데 중요해지므로 요일배열을 잘 작성해야한다.
										// 요일배열을 작성하는 팁은 1월1일을 기준으로 작성하는 것이다. 1월1일은 누적일수가 1이 되므로 위의 연산을 하면 s가 1이 되어 요일배열의 인덱스1(배열의 2번째값)요일이다.
										// 그래서 요일배열의 두번째 값을 2016년 1월 1일 금요일로 설정하고 앞 뒤를 맞추면된다.
		
		
		
		return answer;
	}

}
