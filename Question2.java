package Junyi;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//�мg�@�ӵ{��,Input �O�@�ӼƦr,Output �O�q 1 ��o�ӼƦr,�������Ҧ� 3 �����ƥH�� 5 ������,���O�ݭn�O�d�P�ɬO 3 �M 5 �����ƪ��`�Ʀr�ơC
		//�����ikey input�Ʀr
		System.out.println("input:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= num; i++){
			if(i%3!=0 && i%5!=0 || i%(3*5)==0)
				count = count+1;
			
		}
		
		System.out.println("ouput:" + count);
	}

}
