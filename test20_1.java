package ex1;

import java.util.*;

public class test20_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"mislav", "stanko", "mislav", "ana"} ;
		String[] arr2 = {"stanko", "ana", "mislav"};
		
		System.out.println(solution(arr1, arr2));
	}

	// 해시맵 자료구조 이용
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();		// 해시맵생성
		
		
		// 이 함수는 getOrDefault(key, value) 함수로 최적화가 가능하다. 이해가 쉽도록 풀어썼음.
		for(int i = 0; i < participant.length; i++) {						// 출전자 명단
			if (map.get(participant[i]) != null)							// 명단에 이미 이름이 있다면
				map.put(participant[i], map.get(participant[i])+1);			// 이름(key)에 맞는 중복인원수(value)를 +1
			else															// 명단에 이름이 없다면
				map.put(participant[i], 1);									// 인원수를 1로 세팅
		}
		
		for(int i = 0; i < completion.length; i++) {						// 완주자 명단
			map.put(completion[i], map.get(completion[i])-1);				// 완주하면 출전자인원수에서 한명씩을 뺀다.
		}
		
		for (String kName : map.keySet()) {									
			if(map.get(kName) > 0)											// 만약 완주하지못한사람이 있다면 1이상의 값을 가졌을것이다.
				answer = kName;											
		}
		
		return answer;
	}
}
