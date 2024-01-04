package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A15552 {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//출력
 
		int N = Integer.parseInt(br.readLine()); //하나만 입력할땐 st.nextToken()필요없음
		
		for (int i = 0; i < N; i++) {
			//StringTokenizer를 for 루프 내부에서 생성하는 이유는 각 라인의 입력이 여러 정수로 이루어져 있을 수 있기 때문입니다. 
			//StringTokenizer를 사용하여 공백으로 구분된 각 정수를 분리하고, 이를 정수로 변환하여 사용합니다. 
			//따라서 각 라인에 대한 처리를 for 루프 내에서 반복적으로 수행하기 위함입니다.
			StringTokenizer st=new StringTokenizer(br.readLine()); //입력하는 수+한칸띄우기
			int A=Integer.parseInt(st.nextToken());
			int B=Integer.parseInt(st.nextToken());
			bw.write(A + B+ "\n");
		}
		br.close(); //br은 close만
		bw.flush(); //bw는 flush,close 둘다
		bw.close();
 
		//BufferedReader (br): br.close();를 호출하여 닫으면 됩니다. 자원 해제는 자동으로 이루어집니다.
		//BufferedWriter (bw): bw.flush();를 호출하여 버퍼를 비우고, 그리고 bw.close();를 호출하여 BufferedWriter를 닫아야 합니다. 
		//버퍼를 비우는 것은 데이터를 출력 스트림으로 내보내기 위해이고, 닫는 것은 파일이나 리소스를 안전하게 해제하기 위한 것입니다.
	}

}
