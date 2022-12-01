import javax.swing.*;
import java.text.*;

public class Lab302 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("##.#");
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height"));
		double BMI = weight/ Math.pow((height/100), 2);
		JOptionPane.showMessageDialog(null, 
				"BMI = " + frm.format(BMI) +
				"\nYou're " + (BMI < 18.5 ? "Underweight" : BMI >= 18.5 && BMI < 24.9 ? "Normal-weight" : BMI >= 25.0 && BMI < 29.9 ? "Overweight" : "Obesity"),
						"BMI",
						JOptionPane.WARNING_MESSAGE);
	}

}
