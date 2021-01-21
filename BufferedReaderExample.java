package study.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 5596번 문제 
public class BufferedReaderExample {
	public static void main(String[] args) throws IOException {
		int sum1=0;
		int sum2=0;
		int result;
		
		// BufferedReader 객체 생성하기 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// readLine() 이용해서 String 형태로 개행문자까지 포함해서 한줄을 통째로 입력받음. and 그걸 StringTokenizer 이용해서 " " 기준으로 쪼갠다.
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		
		
		// 쪼갠 값이 존재할 때 까지 반복한다.
		while(st.hasMoreTokens()) {
			// nextToken()을 이용해서 남은 토큰을 String -> int 로 형변환 하여 누적해서 더한당.
			sum1 += Integer.parseInt(st.nextToken());
		}
		while(st2.hasMoreTokens()) {
			sum2 += Integer.parseInt(st2.nextToken());
		}
		
		if (sum1 > sum2) {
			result = sum1;
		}
		else if (sum1 < sum2) {
			result = sum2;
		}
		else {
			result = sum1;
		}
		System.out.println(result);
	}
}
