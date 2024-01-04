package Baekjoon;

import java.util.Scanner;

public class A2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		int total = 0;
		int i = 0;

		for (i = 0; i < word.length() - 1; i++) {

			//System.out.println(total);

			//System.out.println(i + "번째진행");

			char charWord = word.charAt(i);
			//System.out.println(i + ":" + charWord);

			char nextCharWord = word.charAt(i + 1);
			//System.out.println(i + ":" + nextCharWord);

			if ((charWord == 'c' || charWord == 's' || charWord == 'z') && (nextCharWord == '=')) {
				total += 1;
				i++;
			} else if ((charWord == 'c' || charWord == 'd') && nextCharWord == '-') {
				total += 1;
				i++;

			} else if ((charWord == 'l' || charWord == 'n') && nextCharWord == 'j') {
				total += 1;
				i++;
				//그냥 알파벳이거나 dz
			} else {

				total += 1;
			}
			//dz= 처리
			if (i < word.length() - 2 && charWord == 'd') {

				char nextNextCharWord = word.charAt(i + 2);
				//System.out.println(i + ":" + nextNextCharWord);

				if (nextCharWord == 'z' && nextNextCharWord == '=') {
					i += 2;
					//위 else참고, total+=1할필요x
				}
			}

		}
		//마지막 글자 처리
		if (i != word.length()) {
			total += 1;
		}
		System.out.println(total);
	}
}
