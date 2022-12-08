
public class lab504 {

	public static void main(String[] args) {
		// String format
		System.out.print(formatNumber(500)); //call formatNumber method
		System.out.print(formatNumber('a'));
		System.out.print(formatNumber(89.9934));
		String strNum = formatNumber("550");
		System.out.println(strNum);
	}
	
	//overloading method
	private static String formatNumber(int value) {
		return String.format("%d", value);
	}
	
	private static String formatNumber(double value) {
		return String.format("%.3f", value);//%.3f = ทศนิยม 3 ตำเเหน่ง
	}
	
	private static String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}
}
