import java.util.*;
public class StudentScore {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[4]; //Array Object
		for(int i=0;i<std.length;i++) {
			System.out.println("How many student in classroom : "+std.length);
			std[i] = new Student(); 
			System.out.println("");
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			System.out.println("--------------------------------------");
			System.out.print("Input student name: ");			
			std[i].setName(scan.next());
			System.out.print("Input student score:");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again:");
				std[i].setScore(scan.nextInt());
			}//end while()
			System.out.println();
		} //end for()
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("--------------------------------------");
		for(Student Stds_ : std) {
			if(Stds_.isPass()) 
				System.out.println(">> "+Stds_.getName()+"get grade"
						+ Stds_.findGrade());
			}
		}

	}

