package Baekjoon;

import java.util.Scanner;

public class A2439 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		//i는 라인번호,j는 공백
		for (int i = 1; i <= N; i++) {
			// 공백 출력
			for (int j = N; j > 0; j--) {
				//공백이 라인번호보다 작을경우 별을출력
				if (j <= i) { 	        

					System.out.print("*");
					//공백이 라인번호보다 클경우 공백출력
				} else {

					System.out.print(" ");
				}
			}

			System.out.println(); // 줄 바꿈
		}
	}
}


