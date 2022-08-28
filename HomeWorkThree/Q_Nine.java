package HomeWorkThree;
import java.util.Scanner;
public class Q_Nine {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        final String months[] = new String[]{"January", "February", "March", "April",
                                             "May", "June","July", "August",
                                             "September", "October", "November", "December"};
        int input;
        System.out.print("Enter the number of the month to find out which season.# ");
        input = in.nextInt();
        input--;
            if (input == 11 || input == 0 || input == 1)
                System.out.println("Winter");
            else if (input == 2 || input == 3 || input == 4)
                System.out.println("Spring");
            else if (input == 5 || input == 6 || input == 7)
                System.out.println("Summer");
            else
                System.out.println("Autumn");
    }
}
