import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        // Original Code
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        System.out.println("box1: " + box1);

        // New code
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: "); 
        int width = input.nextInt();
        System.out.print("Enter height: "); 
        int height = input.nextInt();


    }

}