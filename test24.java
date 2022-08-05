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
        ArrayList<String> list = new ArrayList<String>(); 
        while(n>0) {
        	list.add(Long.toString(n%10));
        	n/=10;
        }
        list.sort(Comparator.reverseOrder());
        for(String i : list)
        	temp += i;
        
        return Long.parseLong(temp);
    }
}
