package HomeWorkSix;

import java.util.Scanner;

public class Q_One {
    public static void main(String[] args) {
        
        double money, rate; // 15%
        int year = 1;
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter your money ...# ");
        money = in.nextDouble();
        System.out.print("Enter rate ...# ");
        rate = in.nextDouble();
        rate = rate/100;
        for(;;){
            money += money*rate;
            
            if(money >= 1000000) break;
            else year++;
        }
        
        System.out.println("Your money = " + money + "\n Year = " + year);
    }
}
