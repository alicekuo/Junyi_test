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
		// (B.) �мg�@�ӵ{����̭����r��,�C�ӳ�r����������,���O��r�����Ǥ��ܡC
		//�����i�ۦ�key�r��
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			System.out.println(reverseWords(str));

	}
	

}
