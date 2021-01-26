package study.test.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm5893 {
	public static void main(String[] args) throws IOException {
  // 백준 5893번 문제 : 17배
  // 테스트 케이스에 대한 답은 맞게 나오는데, 제출했을 때 오류가 난다.
  // 이유를 잘 모르겠음. 일단 이 상태로 올리고, 나중에 다시 풀어볼 것 !
  
		long result = 0;
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 한줄 통째로 입력받기.
		String[] arr = br.readLine().split(""); // 한글자씩 자르기 위해서 !
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i].equals("1")) {
				result += Math.pow(2, (7-i)); // 첫번째 자리의 숫자를 할 때 i=7이니까, i대신 7-i를 곱해주어야 한다 !
			}
		}
		result *= 17; // 결과에 17배 해주기 
		
		while(result > 0) {
			if(result % 2 == 1) {
				sb.append("1");
			}
			else {
				sb.append("0");
			}
			result /= 2;
		}
		System.out.println(Long.parseLong((sb.reverse().toString())));
/*	
 		split() 말고 charAt()을 이용해서 한글자씩 자르기!
 	
		String str = br.readLine().toString();
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
*/
	}
}
