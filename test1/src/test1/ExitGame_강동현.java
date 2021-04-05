package test1;

import java.util.Scanner;

public class ExitGame_강동현 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []a = new int[5];
		int num = 0;
		int val;
		
		
		for(val=0;val<5;val++) {
			a[val]=sc.nextInt();
			num+=a[val];
			if(num>=100)
				break;
			System.out.println("입력:"+ a[val] +","+" 합:" + num);
			
		}
		System.out.println(num);
		System.out.println("프로그램 종료!");
	}

}