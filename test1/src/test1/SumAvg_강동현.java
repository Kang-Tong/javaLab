package test1;

public class SumAvg_강동현 {
	public static void main(String[] args) {
		double a;
		double sum = 0;
		double avg = 0;
		for ( a=1; a<=100; a++) {
			sum = sum + a;
			avg = sum / 100;
			
		}
		System.out.println("1~100 합계 :"+sum);
		System.out.println("평균 :"+ avg);
	}

}
