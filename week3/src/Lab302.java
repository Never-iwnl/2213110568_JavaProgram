import javax.swing.*;

import java.text.*;
public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.0");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:	"));
		double height =  Integer.parseInt(JOptionPane.showInputDialog("Input Height: "));
		double height2 = height/100;
		double Bmi = weight/(height2*height2);
		if (Bmi<18.5) {
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(Bmi)
			+"\nYou're Underweight","Bmi",JOptionPane.WARNING_MESSAGE);
		}
		if (Bmi<24.9) {
				JOptionPane.showMessageDialog(null,"BMI = "+frm.format(Bmi)
				+"\nYou're Normal-weight","Bmi",JOptionPane.WARNING_MESSAGE);
		}
		if (Bmi<29.9) {
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(Bmi)
			+"\nYou're Overweight","Bmi",JOptionPane.WARNING_MESSAGE);
		}
		if (Bmi>30) {
			JOptionPane.showMessageDialog(null,"BMI = "+frm.format(Bmi)
			+"\nYou're Obesity","Bmi",JOptionPane.WARNING_MESSAGE);
		}

		}
		}

