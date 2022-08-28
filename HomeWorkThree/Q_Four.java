package HomeWorkThree;
import java.util.Scanner;
public class Q_Four {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int answer = 0, digits = 10, scale = 999999999, number;
        System.out.print("Enter any number for check the number of digit in it\n--> ");

        number = in.nextInt();
        number = (number < 0) ? number*-1 : number;
        
        for (int i=0; i<9; i++) {
        answer = (number > scale) ? digits : --digits ;
        scale*=0.1;
        }
        
        System.out.println("The digits of number is : " + answer);
    }
}
