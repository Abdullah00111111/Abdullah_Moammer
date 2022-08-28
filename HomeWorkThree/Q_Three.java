package HomeWorkThree;
import java.util.Scanner;
public class Q_Three {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter any number : ");
        int number = in.nextInt();
        String result;
        result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero" ;
        
        System.out.println("The number is : " + result);
    }
}
