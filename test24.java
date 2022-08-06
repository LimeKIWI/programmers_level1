package ex1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class test24 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        
        long temp = solution(a);
        
        for (int i = 0; i < a; i++) {
        	System.out.println(temp);
        }
        sc.close();
    }
	
	public static long solution(long n) {
        String temp ="";
        ArrayList<String> list = new ArrayList<String>(); 	// list생성
        while(n>0) {
        	list.add(Long.toString(n%10));					// 숫자를 왼쪽부터 한자리씩 list에 저장한다.
        	n/=10;
        }
        list.sort(Comparator.reverseOrder());				// 내림차순으로 list를 정렬한다.
        for(String i : list)
        	temp += i;										// temp문자열에 리스트의 모든 값을 넣는다.
        
        return Long.parseLong(temp);						// 리턴타입이 long이므로 String타입 temp를 long타입으로 형변환한다.
    }
}
