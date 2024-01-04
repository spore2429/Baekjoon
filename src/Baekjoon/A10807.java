package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A10807 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //1.정수 총갯수 입력 ex)11개 int N
        //2.11개 의 정수 입력 int [] arr
        //3.11개중에 내가 찾고싶은 정수 입력 int v
        //4.int count 출력
        
        //정수의 갯수
        int N = Integer.parseInt(br.readLine());

        //N의 갯수 만큼의 정수 담을 배열
        int[] arr = new int[N];
        
        //찾으려는 정수v의 갯수
        int count=0;

        // 두 번째 토큰부터 N개의 정수를 배열에 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int v=Integer.parseInt(br.readLine());
        
        //N이 결국 배열의 길이임~
        for (int j=0; j<N; j++) {
        	
        	if(v==arr[j]) {
        		count++;
        	}
        }
        bw.write(count+"\n");
        
        br.close();
        bw.flush();
        bw.close();
    }
}
