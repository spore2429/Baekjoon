package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A10952 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		//while(true)는 특정 조건이 충족될 때까지 계속해서 실행해야 하는 경우에 사용됩니다.
		while(true) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());

			if(A==0 && B==0) {
				break;	
			}else {
				bw.write(A+B+"\n");
			}

		}
		br.close();
		bw.flush();
		bw.close();
	}

}
