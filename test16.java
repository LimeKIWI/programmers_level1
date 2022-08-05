package ex1;

public class test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean solution(String s) {
        s = s.toLowerCase();
        
        long count1 = s.chars().filter(ch -> ch == 'p').count();
        long count2 = s.chars().filter(ch -> ch == 'y').count();
              
        return count1 == count2 ? true : false;
    }
}
