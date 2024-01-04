package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A2525 {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(); // 시간
		int B = sc.nextInt(); // 분
		int C = sc.nextInt(); // 타이머(분)

		A += C / 60; // 타이머가 100분이라 가정했을때 당연히 시간이 늘어나야함
		B += C % 60; // 타이머가 40분이면 0분 타이머가 70분이면 10분

		if (B >= 60) {
			B -= 60;
			A++; // 60분을 넘겼으므로 1시간 늘어남
		}
		if (A >= 24) {
			A -= 24;
		}

		System.out.println(A + " " + B);
	}*/
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int a = Integer.parseInt(st.nextToken()); // 시간
		int b = Integer.parseInt(st.nextToken()); // 분
		int c = Integer.parseInt(bf.readLine());  // 타이머

		int min = 60 * a + b; // 시간 -> 분
		min += c;

		int hour = (min / 60) % 24;
		int minuate = min % 60;

		System.out.println(hour + " " + minuate);
	}
}
