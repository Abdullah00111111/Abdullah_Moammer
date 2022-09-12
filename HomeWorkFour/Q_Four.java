package HomeWorkFour;

import java.awt.Rectangle;
import java.util.Scanner;

public class Q_Four {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        Rectangle box = new Rectangle();
        
        System.out.println("Wilcome to AddTester\n");
        
        System.out.print("Enter height : ");
        box.height = in.nextInt();
        System.out.print("Enter width : ");
        box.width = in.nextInt();
        System.out.print("Enter X : ");
        box.x = in.nextInt();
        System.out.print("Enter Y : ");
        box.y = in.nextInt();
        
        box.add(0, 0);
        
        System.out.println("The height is ( " + box.height + " )\nThe width is ( " + box.width + " )\n"
                + "The X is ( " + box.x + " )\nThe Y is ( " + box.y + " )");
        
        
    }
}
