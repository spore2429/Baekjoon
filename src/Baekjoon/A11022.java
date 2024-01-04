package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A11022 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //입력
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //출력
		
		int T=Integer.parseInt(br.readLine()); //한개만 입력시 st.nextToken()사용할 필요x
		
		for(int i=0; i<T; i++) {
			//for문안에 StringTokenizer를 생성하는이유!
			//따라서 각 라인이 정수로 이루어져있으며 그에 대한 처리를 for 루프 내에서 반복적으로 수행하기 위함.
			StringTokenizer st=new StringTokenizer(br.readLine()+" "); //" "를 통해 A입력후 공백 B
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			
			System.out.println("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B));
		}
	}

}
