package Baekjoon;

import java.util.Scanner;

public class A8393 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total=0;
		for(int i=n; i>0; i--) {
			total+=i;
		}
		System.out.println(total);
		
		
	}

}
