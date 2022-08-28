package HomeWorkThree;
import java.util.Scanner;
public class Q_Five {
    public static void main(String[] args) {
        
        int n[] = new int[3];
        String answer;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Three numbers");
        
        for (int i=0; i<3; i++) {
            System.out.print("Number #" + (i+1) + " : ");
            n[i] = in.nextInt();
        }
        
        answer = (n[0] == n[1] && n[0] == n[2]) ? "All the same" : (n[0] != n[1] && n[1] != n[2]) ? "All different" : "Neither" ;
        
        System.out.print("Answer is : " + answer);
    }
}
