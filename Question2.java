package Junyi;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//叫糶祘Α,Input 琌计,Output 琌眖 1 硂计,Ι埃奔┮Τ 3 计の 5 计,琌惠璶玂痙琌 3 ㎝ 5 计羆计计
		//磅︽key input计
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
