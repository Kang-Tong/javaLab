import java.util.Scanner;
import java.util.GregorianCalendar;
public class YearCheck {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�.");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		GregorianCalendar year2 = new GregorianCalendar();
		if (year2.isLeapYear(year)) {
			System.out.println(year + "���� ����");
		} else {
			System.out.println(year + "���� ���");
		}
	}
}
