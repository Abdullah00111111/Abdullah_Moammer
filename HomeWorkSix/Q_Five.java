package HomeWorkSix;

import java.util.Scanner;

public class Q_Five {
    public static void main(String[] args) {
        
        char []vowels = new char[] {'a','e','i','o','u','y'};
        Scanner in = new Scanner(System.in);
        int counter = 0;
        
        System.out.print("Enter any text ... # ");
        String text = in.nextLine();
        
        for(int i=0; i < text.length() ; i++)
            for(int j=0; j < 6; j++)
                if(text.charAt(i) == vowels[j])
                    counter++;
        
        System.out.println("Now the number of Vowels in text = " + counter);
        
    }
}
