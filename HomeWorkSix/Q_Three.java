package HomeWorkSix;

import java.util.Scanner;

public class Q_Three {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name ... # ");
        String name = in.next();
        
        for(int i=0; i < name.length(); i++){  
            System.out.println(name.charAt(i));
        }
    }
}
