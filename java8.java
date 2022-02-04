import java.util.Scanner;
public class java8 {
	public static final double PI = 3.12;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		double area = PI * radius * radius;
		
		System.out.println("Area of the circle = " + area);

	}

}
