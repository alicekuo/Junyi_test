package Junyi;

import java.util.Scanner;

public class Question1a {

	public static void main(String[] args) {
		// (A.) �мg�@�ӵ{����̭����r��ϹL�ӡC
		//�����i�ۦ�key�r��
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}

}
