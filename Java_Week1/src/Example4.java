import javax.swing.*;

public class Example4 {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("Input product name: ");
		String productUnitstr = JOptionPane.showInputDialog("Input product unit: ");
		int productUnit = Integer.parseInt(productUnitstr);
		
		float productPricePerUnit= Float.parseFloat(
				JOptionPane.showInputDialog("Input price per unit: "));
				
			float totalPrice = productUnit*productPricePerUnit;
			float totalwithVat = totalPrice+(totalPrice*7/100);
			
			JOptionPane.showMessageDialog(null,
					"Total Price is "+totalPrice+"bath."+
			"\nAdd VAT 7% is "+totalwithVat+"bath");
		
		
	}

}
