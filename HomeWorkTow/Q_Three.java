package HomeWorkTow;
import java.util.Scanner;
public class Q_Three {
    public static void main(String[] args) {
        
        int Length, Width;
        Scanner in = new Scanner (System.in);
        System.out.println("Calculate The Area Of A​a Rectangle");
        
        System.out.print("Please Enter The Length: ");
        Length = in.nextInt();
        
        System.out.print("Please Enter The Width: ");
        Width = in.nextInt();
        
        System.out.println("The Rectangle Area Is: " + (Length * Width));
        
    }
}
