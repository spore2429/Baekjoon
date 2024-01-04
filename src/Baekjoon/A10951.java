package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class A10951 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            StringTokenizer st;						// 문자열 분리
            String str = "";
            
            //br.readLine()만 조건에 걸어두면 동작X
            while((str=br.readLine()) != null) {	// readLine() 을 통해 str에 저장된 데이터가
                st = new StringTokenizer(str);		// null 일 경우 반복문 종료
                //다음 입력값이 있을경우
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}