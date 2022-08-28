package HomeWorkThree;
import java.util.Scanner;
public class Q_Tow {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        char character[] = new char[] {'a','c','e','g','b','d','f','h'};
        
        System.out.println("Enter the letter and then the number to find the color of the squara on the chessboard.");
        System.out.print("Enter the letter : ");
        char letter = in.next().charAt(0);
        System.out.print("Enter the number: ");
        byte number = in.nextByte();
        
        for (int i=0; i<8; i++)
            if (letter == character[i] && i<4){
                if (number%2 == 1) { System.out.println("Black"); break;}
                else { System.out.println("White"); break;}
            }
            else {
                if (number%2 == 1) { System.out.println("White"); break;}
                else { System.out.println("Black"); break;}
            }   
    }
}
