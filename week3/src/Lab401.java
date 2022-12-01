import javax.swing.*;
import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.print("Full name : ");
		String fullName =scan.nextLine();
		String firstName="";
		String lastName="";
		int space = fullName.indexOf(" ");
		System.out.print("First name: "+fullName.substring(0,space));
		System.out.print("Last name: "+fullName.substring(0,space)); 
		
		
		
		
		
	}
}

