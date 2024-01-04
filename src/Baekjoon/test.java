package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class test {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

     
            StringTokenizer st;						// 문자열 분리
            String str = "";

            while((str=br.readLine()) != null) {	// readLine() 을 통해 str에 저장된 데이터가
                st = new StringTokenizer(str);		// null 일 경우 반복문 종료
                if(st.hasMoreTokens()) {
                	int A=Integer.parseInt(st.nextToken());
                	int B=Integer.parseInt(st.nextToken());
                    bw.write(A + B + "\n");
                }else {
                    break;
                }
            }
            br.close();
            bw.flush();
            bw.close();
    
    }
}