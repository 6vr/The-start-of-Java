
import java.util.Scanner;
class Rectangle {
	//attributes, properties, data members 
	public int length;
	public int width;
	public int area;
	//method
	public void printArea(){
		System.out.println("Area = " + area);
	}
}

public class java11 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		rec.length = reader.nextInt();
		rec.width = reader.nextInt();
		rec.area = rec.length * rec.width;
		rec.printArea();
		
		Rectangle rec2 = new Rectangle();
		rec2.length = reader.nextInt();
		rec2.width = reader.nextInt();
		rec2.area = rec2.length * rec2.width;
		rec2.printArea();
		
		Rectangle rec3 = new Rectangle();
		rec3.length = reader.nextInt();
		rec3.width = reader.nextInt();
		rec3.area = rec3.length * rec3.width;
		rec3.printArea();
		
		Rectangle rec4 = new Rectangle();
		rec4.length = reader.nextInt();
		rec4.width = reader.nextInt();
		rec4.area = rec4.length * rec4.width;
		rec4.printArea();
		
		Rectangle rec5 = new Rectangle();
		rec5.length = reader.nextInt();
		rec5.width = reader.nextInt();
		rec5.area = rec5.length * rec5.width;
		rec5.printArea();

	}

}
