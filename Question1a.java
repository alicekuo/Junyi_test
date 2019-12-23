package Junyi;

import java.util.Scanner;

public class Question1a {

	public static void main(String[] args) {
		// (A.) 請寫一個程式把裡面的字串反過來。
		//執行後可自行key字串
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}

}
