package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A10871 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

		//1.정수 총갯수 입력 ex)11개 int N
		//X보다 작은수를 찾아야하므로 기준이 되는X입력 int X
		//2.11개 의 정수 입력 int [] A
		//3.X보다 작은 수 출력, X보다 작은 수는 적어도 하나 존재한다.

		StringTokenizer st=new StringTokenizer(br.readLine());

		int N=Integer.parseInt(st.nextToken());
		int X=Integer.parseInt(st.nextToken());
		int [] A=new int[N];

		st=new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {

			
			A[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int j=0; j<N; j++) {
			
			if(A[j]<X) {
				bw.write(A[j]+" ");
			}
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
