package HomeWorkSix;

import java.util.Scanner;

public class Q_Tow {
    public static void main(String[] args) {
        
        // A -------------------------------------
        int sum = 0;
        for (int i=2 ; i<=100; i+=2) { sum += i; }
        System.out.println("The sum is = " + sum);
        // A -------------------------------------
        
        // B -------------------------------------
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter any numbers from a to b ...\nEnter a ...# ");
        int a = in.nextInt();
        System.out.print("Enter b ...# ");
        int b = in.nextInt();
        int min = (a > b || a == b)? b : a ;
        int max = (a > b || a == b)? a : b ;
        
        sum = 0;
        for (int i = min; i <= max; i+=2) { sum += i ; }
        
        System.out.println("The sum = " + sum);
        // B -------------------------------------
        
        // C -------------------------------------
//        System.out.print("The sum of all odd digits of an input...\nEnter number ...# ");
//        Scanner in = new Scanner(System.in);
//        
//        int sum = 0, utensil = 0, number = in.nextInt();
//        
//        for(;;){
//            
//            utensil = number % 10;
//            sum += (utensil%2 == 1)? utensil : 0 ;
//            number /= 10;
//            
//            if(number == 0) { break; }
//        }
//        
//        System.out.println("The sum of all odd digits is = " + sum);
        // C -------------------------------------
        
    }
}
