package study.test.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm10162 {
	public static void main(String[] args) throws IOException {
		// 백준 알고리즘 10162번 문제 : 전자레인지.
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int time = Integer.parseInt(br.readLine()); // 요리시간 T 입력받기 (1 <= T <= 10,000)
		int a=0, b=0, c = 0; // 버튼 조작 횟수.
		
		while(time > 0) {
			if((time % 10) != 0) {
				System.out.println("-1");
				return; // main메소드는 반환값이 없는 void니까 return 만 써주면 된당.
			}
			else {
				if (time >= 300) {
					int q = time / 300;
					a += q;
					time = time % (300 * q);
				}
				else if (time >= 60) {
					int q = time / 60;
					b += q;
					time = time % (60 * q);
				}
				else if (time >= 10) {
					int q = time / 10;
					c += q;
					time = time % (10 * q);
				}
			}
		}
		System.out.printf("%d %d %d",a,b,c);
	}
}
