package Baekjoon;

import java.util.Scanner;

public class A2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		// 알람을 45분 일찍 맞춰야함
		if (M < 45) {
			H=H-1; // 45분보다 작으므로 1시간이 감소 H--;랑 같은뜻임
			M = 60 - (45 - M); // ex) 44분일 경우 59분이되야함
			if (H < 0) {
				H = 23; // 0은 24시 자정
			}
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}

	}

}
