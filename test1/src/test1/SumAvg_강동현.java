package test1;

public class SumAvg_������ {
	public static void main(String[] args) {
		double a;
		double sum = 0;
		double avg = 0;
		for ( a=1; a<=100; a++) {
			sum = sum + a;
			avg = sum / 100;
			
		}
		System.out.println("1~100 �հ� :"+sum);
		System.out.println("��� :"+ avg);
	}

}
