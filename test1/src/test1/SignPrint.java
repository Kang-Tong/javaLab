package test1;

import java.util.Scanner;

public class SignPrint {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("num�� ���� �Է��ϼ���.");
        
        num = sc.nextInt();
        
        System.out.println(num>=0?(num==0?"0":"���"):"����");
    }

}