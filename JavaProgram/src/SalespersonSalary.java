import javax.swing.*;
import java.text.*;
import java.util.Scanner;

public class SalespersonSalary {
	static final double COMMISSION_RATE = 0.15;
	static final int SENTINEL = -1;

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		int sales;
		double salary;
		while(true)
		{
			System.out.print("Enter salary in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if (sales == SENTINEL)
			{
				System.out.print("bye");
				break;
			}
			salary = 1000 + (sales * COMMISSION_RATE);
			System.out.println("Salary is: $" + frm.format(salary));
			System.out.println();
		}

	}

}
