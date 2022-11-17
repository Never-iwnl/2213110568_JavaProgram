import java.util.*;
import java.text.*;

public class Example3 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in); //define object of input data from keyboard
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = scan.nextInt();
		System.out.print("Input price per unit : ");
		float pricePerUnit= scan.nextFloat();
		System.out.println();
		float totalPrice = productUnit*pricePerUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		float totalwithVat = totalPrice+(totalPrice*7/100);
		System.out.println("Add VAT 7% is "+frm.format(totalwithVat)+" baht.");
	}

}
