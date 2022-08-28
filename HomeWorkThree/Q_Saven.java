package HomeWorkThree;
import java.util.Scanner;
public class Q_Saven {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        int n[] = new int [3];
        String answer;
        
        System.out.println("Enter three numbers...");
        for (int i=0; i<3; i++){
            System.out.print("Number " + (i+1) + "# ");
            n[i] = in.nextInt();
        }
        
        answer = (n[0] <= n[1] && n[1] <= n[2]) ? "In order" : (n[0] >= n[1] && n[1] >= n[2]) ? "In order" : "Not in order" ;
        System.out.println("The answer is : " + answer);
    }
}
