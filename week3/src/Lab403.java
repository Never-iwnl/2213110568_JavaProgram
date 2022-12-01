import java.util.Scanner;

public class Lab403 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Message : ");
		String mes = scanner.nextLine();
		String lowMes = mes.toLowerCase();
		if(lowMes.indexOf("nichi")>=0) {
			System.out.println("Nichi is a message");
		} else {
			System.out.println(mes);
		}

	}

}
