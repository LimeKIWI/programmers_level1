package ex1;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // 두번째 입력받은 만큼 반복
        for (int i = 0; i < b; i++) {
        	// 첫번째 입력받은 만큼 반복
        	for(int j = 0; j < a; j++) {
        		//반복수만큼 *을 출력
                System.out.print("*");
        	} 
        	System.out.println();
        }
        sc.close();
    }
}
