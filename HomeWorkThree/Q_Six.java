package HomeWorkThree;
import java.util.Scanner;
public class Q_Six {
    public static void main(String[] args) {
        
        int n[] = new int[3];
        String answer;
        Scanner in = new Scanner (System.in);
        
        for(;;){
            System.out.println("Enter three numbers. ");
            for (int i=0; i<3; i++) {
                System.out.print("Number #" + (i+1) + " : ");
                n[i] = in.nextInt();
            }
        
            answer = (n[0] <= n[1]) ? (n[1] < n[2])  ? "Increasing" 
                    :(n[1] == n[2]) ? "Increasing then Increasing" 
                    :"Increasing then decreasing"
                    :(n[0] > n[1]) ? (n[1] > n[2])  ? "Diminished"
                    : "Decreasing then increasing"
                    : "equals" ;
        
            System.out.println("The answer is : " + answer);
        }
    }
}
