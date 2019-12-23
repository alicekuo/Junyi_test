package Junyi;

import java.util.Scanner;

public class Question1b {

	public static String reverseWords(String s){
		String words[] = s.split(" ");
		StringBuilder res = new StringBuilder();
		for(String w:words)
			res.append(new StringBuffer(w).reverse().toString() + " ");
		return res.toString();
	}
	
	public static void main(String[] args) {
		// (B.) 請寫一個程式把裡面的字串,每個單字本身做反轉,但是單字的順序不變。
		//執行後可自行key字串
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			System.out.println(reverseWords(str));

	}
	

}
