import java.util.*;
public class HwLab504 {

	public static void main(String[] args) {
		    String fullNmae ;
		    Scanner scan = new Scanner(System.in); {
			System.out.print("please enter your name, separated by a space. "+"\n:");
			String fullName = scan.nextLine();
			String firstName= fullName.substring(0,fullName.indexOf(' '));
			System.out.println(abbreviatName(fullName)+firstName);}

	}
public static String abbreviatName(String fullName) {
			String initialLetter ="";
			for(int i=0 ; i<fullName.length(); i++) {
				if(fullName.charAt(i)==' ') {
				initialLetter = (initialLetter+fullName.charAt(i+1));
				initialLetter = initialLetter+ ".";
			}
		}
			return initialLetter;
	}

}
