
import javax.swing.*;

public class Lab605 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i =0;i<nums.length;i++) {
		nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i + 1 )+":"));
		}
		showEven(nums);
		showOdd(nums);
		}
	
	public static void showEven(int[] nums) {
		String Even = " ";
		
		for(int even : nums) 
			if(even%2 ==0) 
				Even = Even+even+ " ";

		JOptionPane.showMessageDialog(null, "List of even Number: \n"+Even, "Message",
				JOptionPane.INFORMATION_MESSAGE);
	
			}
		
		

	public static void showOdd(int[] nums) {
		String Odd = " ";
		for(int _Num : nums) 
			if(_Num%2 !=0) 
				Odd = Odd+_Num+" ";
				
				JOptionPane.showMessageDialog(null, "List of Odd Number: \n"+Odd, "Message",
						JOptionPane.INFORMATION_MESSAGE);
			}
		
	
	}
		
	


