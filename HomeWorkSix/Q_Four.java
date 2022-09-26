package HomeWorkSix;

import java.util.Scanner;

public class Q_Four {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter your name ... # ");
        String name = in.next();
        
        for(int i=name.length() -1; i >= 0; i--)
            System.out.print(name.charAt(i));
    }
}
