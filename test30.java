package ex1;

public class test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		System.out.println(solution(arr));

	}
	public static int solution(int[][] sizes) {
        int x = 0, y = 0, minX = 0, minY = 0;
        
        
        for(int i = 0; i < sizes.length; i++) {		
        	// 카드 돌리기부터 한다. x(가로)가 짧은쪽 y(세로)가 넓은쪽이 될것이다. 
        	if(sizes[i][0] < sizes[i][1])
        	{
        		x = sizes[i][0];
        		y = sizes[i][1];
        	}
        	else {
        		x = sizes[i][1];
        		y = sizes[i][0];
        	}
    		if(minX < x)		// 만약 가로의 길이가 지금까지 봤던 가로의 길이보다 크다면 그게 최소한으로 필요한 가로크기가된다.
    			minX = x;
    		if(minY < y)		// 세로의 길이도 마찬가지로 계산한다.
    			minY = y;
        }
        
//		Math의 max함수를 활용해서 구현된 코드이다.        
//        for (int[] card : sizes) {
//            length = Math.max(length, Math.max(card[0], card[1]));
//            height = Math.max(height, Math.min(card[0], card[1]));
//        }
        
        return minX*minY;		// 곱을 반환
    }
}
