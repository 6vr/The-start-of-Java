import java.util.Scanner;
public class java6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		System.out.println("sum = " + sum);
		
		int sub = num2 - num1;
		System.out.println("sub = " + sub);
		
		int mul = num1 * num2;
		System.out.println("mul = " + mul);
		
		int div = num2 / num1;
		System.out.println("div = " + div);

	}

}
 