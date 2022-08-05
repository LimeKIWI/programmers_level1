package ex1;

import java.util.Scanner;

public class test33 {

	public static void main(String[] args) {
		int[] arr1 = {44, 1, 0, 0, 31, 25};
		int[] arr2 = {31, 10, 45, 1, 6, 19};
		
		arr2 =solution(arr1, arr2);
		
		System.out.println(""+arr2[0]+" "+arr2[1]);
		
	}

	public static int[] solution(int[] lottos, int[] win_nums) {

		int unknownCount = 0;
		int matchCount = 0;

		for (int l : lottos) {
			if (l == 0)
				unknownCount++;
			else {
				for (int w : win_nums) {
					if (w == l)
						matchCount++;
				}
			}

		}

		int max = (matchCount + unknownCount);
		int min =  matchCount;
		
		

		int[] answer = { score(max), score(min) };

		return answer;
	}
	
	public static int score (int num) {
		if(num <= 1) 
			return 6;
		else if(num == 2)
			return 5;
		else if(num == 3)
			return 4;
		else if(num == 4)
			return 3;
		else if(num == 5)
			return 2;
		else 
			return 1;
	}
}
