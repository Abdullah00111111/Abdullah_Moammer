package HomeWorkThree;
import java.util.Scanner;
public class Q_Ten {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int [][] months_and_days = {{1,2,3,4,5,6,7,8,9,10,11,12},{31,28,31,30,31,30,31,31,30,31,30,31}};
        final String months[] = new String[]{"January", "February", "March", "April",
                                             "May", "June","July", "August",
                                             "September", "October", "November", "December"};
        int input;
        System.out.print("Enter the number of the month to know its name and the number of days.# ");
        
        input = in.nextInt();
        for (int i=0; i<12; i++){
            if (input-1 == i){
                System.out.println("The name of the month is : " + months[input -1] +
                        " and the number of his days is : " + months_and_days[input -1][1] );
            }         
        }
            
        
        
    }
}
