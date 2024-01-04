package Baekjoon;

import java.util.Scanner;

public class A25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt(); //총가격
		int N=sc.nextInt(); //물건종류의수 ex)과일,수산물 >2개 과일,수산물,육류 >3개 //for문 몇번돌릴건지?
		int total=0; //물건의 가격 * 수량 X랑비교하기위해 만듬
		
		for(int i=0; i<N ; i++) {
			int a=sc.nextInt(); //각 물건의 가격
			int b=sc.nextInt(); //각 물건의 수량
			//System.out.println(a*b);
			total+=a*b;
		}
			if(X==total) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	}

}
