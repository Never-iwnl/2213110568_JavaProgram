import java.util.*;
import javax.swing.*;
import java.util.*;

import java.text.*;
public class Lab1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in); //define object of input data from keyboard
		System.out.print("Input product name : ");
		String productName = scan.nextLine();
		System.out.print("Input product unit : ");
		float productUnit = scan.nextFloat();
		System.out.print("Input price per unit : ");
		float pricePerUnit= scan.nextFloat();
		System.out.println("----------------------------------");
		float totalPrice = productUnit*pricePerUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		System.out.println("----------------------------------");
		System.out.print("How many discount(%) : ");
		int dis = scan.nextInt();
		System.out.println("----------------------------------");
		System.out.println("Discount from 15%\t"+frm.format(+totalPrice*dis/100)+" bath.");
		float disF = totalPrice*dis/100;
		System.out.print("Amount to be paid\t"+frm.format(+totalPrice-disF)+" bath");
				
	}

}
