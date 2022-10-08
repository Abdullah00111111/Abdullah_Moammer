package HomeWorkSaven;

import java.util.Scanner;

public class basicAccount extends bankAccount{
    Scanner in;
    /**
     * if yes, it is the second question in lab7.
     * but
     * if no, ir is the first question in lab7.
     * @param balance 
     */
    public void Q_One_Q_Tow(double balance){
        in = new Scanner(System.in);
        if(super.getBalance()- balance < 0){
            System.out.println("Withdrawal is greater than the amount you have.\nDo you want to continue anyway with a $30 fine.\n1) Yes\n2) No");
            if(in.nextInt() == 1) {
                super.addMoney(balance);
                super.fine += (30 + balance);
            }
        }
        else{
            super.disMoney(balance);
        }
    }
}
