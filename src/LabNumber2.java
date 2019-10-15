import java.util.Scanner;

public class LabNumber2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String contString = "yes";
		
		while (contString.equalsIgnoreCase("yes")) {

			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println("(Enter all measurements in feet as a decimal)");

			System.out.println("Enter length: ");
			double length = scan.nextDouble();
			System.out.println("Length equals: " + length);

			System.out.println("Enter width: ");
			double width = scan.nextDouble();
			System.out.println("Width equals: " + width);
			
			System.out.println("Enter height: ");
			double height = scan.nextDouble();

			System.out.println();

			System.out.println("Area of the room equals: " + length * width + " square feet.");
			System.out.println("Perimeter of the room equals: " + ((length * 2) + (width * 2)) + " feet.");
			System.out.println("Volume of the room equals: " + (length * width * height) + " cubic feet.");	
			
			System.out.println();
			System.out.println("Continue? (yes/no)");
			contString = scan.next();
		}

		System.out.println("Goodbye");
		scan.close();
	}
}
