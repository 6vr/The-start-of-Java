import java.util.Scanner;
public class java10 {

	public static void main(String[] args) {
		
		//input ������� 
		int amount, halfs, quarters, qirshs, origAmount;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount:");
		amount = origAmount = input.nextInt();
		
		//processing �������� 
		halfs = amount / 50;
		amount %= 50; // amount = amount % 50 
		quarters = amount / 25;
		amount %= 25;
		qirshs = amount / 10;
		amount %= 10;
		
		//output �������
		System.out.println("Original amount = "+ origAmount +"\n" 
				+ "Change: \n"
				+ "halfs    = " + halfs + " \n"
				+ "quarters = " + quarters + "\n"
				+ "qirshs   = " + qirshs + "\n"
				+ "halals   = " + amount);

	}

}
