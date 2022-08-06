package ex1;


public class test10 {
	public static void main(String[] args) {
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		arr1 = solution(arr1, arr2);
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		

	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = arr1;							//출력할 배열의 크기는 입력받는 배열들의 크기와 동일함.

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];	//각 배열의 값들을 더해서 answer에 저장
			}
		}

		return answer;
	}

}
