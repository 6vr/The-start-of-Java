import java.util.Scanner;
public class java7 {
	public static void main(String[] args) {
		Scanner keyboord = new Scanner(System.in);
		
		System.out.print("Enter rectangle length: ");
		double length = keyboord.nextDouble();
		
		System.out.print("Enter rectangle width: ");
		double width = keyboord.nextDouble();
		
		double area = length * width;

		
		System.out.println("Rectangle area = " + area); 
		}

}
