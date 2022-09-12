package HomeWorkFour;
import java.awt.Rectangle;
import java.util.Scanner;
public class Q_One {
    public static void main(String[] args) {
        
        Rectangle R = new Rectangle();
        Scanner in = new Scanner (System.in);
        
        System.out.print("Please enter the width : ");
        R.width = in.nextInt(); 
        System.out.print("Please enter the Height : ");
        R.height = in.nextInt();
        
        System.out.println("the perimeter is : " + 2*(R.getWidth() + R.getHeight()));
    }
}
