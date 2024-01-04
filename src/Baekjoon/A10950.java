package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A10950 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		

		int T = Integer.parseInt(br.readLine()); //for문의 반복수

		for (int i = 0; i < T; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine()); //입력하는 수+한칸띄우기
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			bw.write(A+B+"\n");
			
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
