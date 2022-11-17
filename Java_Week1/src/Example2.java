import javax.swing.*;
import java.text.*;

public class Example2 {
    static final float BUFFETPRICE=299;
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberofCustomer=5;
		float totalPrice = BUFFETPRICE * numberofCustomer;
		System.out.println("Buffet of "+numberofCustomer+
				" customers is "
				+frm.format(totalPrice));
		float serviceCharge = totalPrice+(totalPrice*3/100);
		System.out.println("TotalPrice with ServiceCharge is "
				+serviceCharge);
		JOptionPane.showMessageDialog(null,
				"Buffet of "+numberofCustomer+
				" customers is "+totalPrice+
				"\nTotalPrice with ServiceCharge is " 
				+frm.format(serviceCharge));
	}

}
