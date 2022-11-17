import javax.swing.*;
import java.text.*;
import java.util.*;
public class Lab3 {

		static final int NOODLESMALL=30;
		static final int NOODLEBIG=60;
		public static void main(String[] args) {
		String SdishStr = JOptionPane.showInputDialog("How many small dish: ");
		int Sdish = Integer.parseInt(SdishStr);
		String BdishStr = JOptionPane.showInputDialog("How many big dish: ");
		int Bdish = Integer.parseInt(BdishStr);
		int totalPrice = (Sdish*NOODLESMALL)+(Bdish*NOODLEBIG);
		JOptionPane.showMessageDialog(null,
				"You order "+SdishStr+"small dish"+"("+NOODLESMALL*Sdish+")"+
				"\nYou order "+BdishStr+"big dish"+"("+NOODLEBIG*Bdish+")"+
				"\nAmount to be paid is "+totalPrice +" bath.",
				"Noodles",
		JOptionPane.WARNING_MESSAGE);
		


		
		
		
	}

}
