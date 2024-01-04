package Baekjoon;

import java.util.Scanner;

public class A2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();		
		String b = sc.next();
				
		System.out.println(a*(b.charAt(2)-'0')+"\n"+
		a*(b.charAt(1)-'0')+"\n"+a*(b.charAt(0)-'0')+"\n"+
				a*Integer.parseInt(b));
	}

}
