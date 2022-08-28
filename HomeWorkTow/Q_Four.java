package HomeWorkTow;
import java.util.Scanner;
public class Q_Four {
    public static void main(String[] args) {
        
        float Number[] = new float[3];
        Scanner in = new Scanner (System.in);
        
        System.out.println("Please Enter Three Numbers...");
        
        for (int i=0; i<3; i++) {
            System.out.print("Number " + (i+1) + " = ");
            Number[i] = in.nextFloat();
        }
        
        System.out.println("Avrege = " + ((Number[0] + Number[1] + Number[2])/3));
    }
}
