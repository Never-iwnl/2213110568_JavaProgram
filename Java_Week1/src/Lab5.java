import javax.swing.JOptionPane;

public class Lab5 {

	public static void main(String[] args) {
		String Timer = JOptionPane.showInputDialog("Input Time Parking(minute) ");
		int timeP = Integer.parseInt(Timer);
		
		int hourS = timeP/60;
		int minS = timeP/60;

	}

}
