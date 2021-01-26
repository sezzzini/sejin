package study.test.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm10101 {
	public static void main(String[] args) throws IOException {
  // 백준 10101번 문제 : 삼각형 외우기
  
	String result;
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 여러 줄 입력받기 : BufferedReader는 1번만 사용하면 되고, 그 다음부터 readLine() 명령이 나올 때 마다 한줄 씩 입력을 받아들이므로, readLine()을 여러번 사용해서 연속으로 입력받기 !
	int a = Integer.parseInt(br.readLine());
	int b = Integer.parseInt(br.readLine());
	int c = Integer.parseInt(br.readLine());
	
	int sum = a+b+c;

	if (a == b && b == c && c == 60) {
		result = "Equilateral";
	}
	else if (sum == 180 && (a == b || b == c || c == a)) {
		result = "Isosceles";
	}
	else if (sum == 180 && (a != b && b != c && c != a)) {
		result = "Scalene";
	}
	else {
		result = "Error";
	}
	System.out.println(result);
	}
}
