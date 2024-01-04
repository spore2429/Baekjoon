package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A10810 {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //입력
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out)); //출력
    StringTokenizer st=new StringTokenizer(br.readLine());
    int N=Integer.parseInt(st.nextToken()); //바구니의 갯수
    int M=Integer.parseInt(st.nextToken()); //공을 던지는 횟수

    int [] arr=new int[N];

    //i~j 1번 바구니부터 j번 바구니까지
    //k 공의번호
    //ex)2 5 6 -> 2번 바구니부터 5번 바구니까지 번호가 6번인공을 넣는다.

    //바구니 시작번호,바구니 끝번호,공의번호 입력
    for(int i=0; i<M; i++) {

      st=new StringTokenizer(br.readLine());
      
      int start=Integer.parseInt(st.nextToken());
      int end=Integer.parseInt(st.nextToken());
      int ballNum=Integer.parseInt(st.nextToken());
      
      //공의번호 구하기
      for(int j=start; j<=end; j++) {
        
        arr[j-1]=ballNum;
      }
    }
      
      //바구니에 공 출력
      for(int k=0; k<N; k++) {
        
        bw.write(arr[k]+" ");
      }
      
      br.close();
      bw.flush();
      bw.close();
  }

}
