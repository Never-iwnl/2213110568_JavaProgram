import javax.swing.JOptionPane;
import java.text.*;
import java.util.*;
public class Lab308 {

	final double TAX_RATE_ABOVE_20K = 0.1;
	final double TAX_RATE_ABOVE_40K = 0.2;
	final double TAX_RATE_ABOVE_60K = 0.3;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in); //define object of input data from keyboard
		double taxPayable;
		System.out.print ("Enter the taxable income :");
		int taxableIncome = scan.nextInt();
		if (taxableIncome <= 20000) { // [0, 20000]
			taxPayable = 0.00;
			System.out.print("The income tax payable is: "+frm.format(taxPayable));
		} else if (taxableIncome <= 40000) { // [20001, 40000]
			taxPayable = 0.10;
			System.out.print("The income tax payable is: "+frm.format(taxPayable));

	}
	}
}
