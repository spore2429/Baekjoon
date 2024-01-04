package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A11021 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//입력
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //출력
		
		//for문 돌리는수 숫자 하나만 입력할땐 st.nextToken()를 사용할필요없음
		int T=Integer.parseInt(br.readLine()); 
		
		for(int i=0; i<T; i++) {
			
			//for문 안에서 생성해야함 A입력후 " "를 통해 A공백B입력가능
			StringTokenizer st=new StringTokenizer(br.readLine()); 
			
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+(A+B)+"\n"); //<br>태그처럼 문단별로 출력해야하므로 \n사용
		}
		br.close(); //br은 close만
		bw.flush(); //bw는 flush,close 둘다
		bw.close();
	}

}
