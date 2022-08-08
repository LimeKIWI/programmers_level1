package ex1;

public class test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,7,6,4};
		
		solution(arr);
		
	}
	public static int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i+1; j < nums.length; j++) {
        		for(int k = j+1; k < nums.length; k++) {
        			int sum = nums[i]+nums[j]+nums[k];
        			int count = sum-1;
        			int flag = 1;
        			while (count>1) {
        				if(sum%count == 0) {
        					flag = 2;
        					break;      				
        				}
        				count--;
        			}
        			if(flag == 1)
        				answer++;
        		}
        	}
        }
       

        return answer;
    }
	
}
