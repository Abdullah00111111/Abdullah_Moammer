package HomeWorkSaven.Q3_4_5_6;

import HomeWorkSaven.*;
import java.util.Scanner;

public class numericQuestion_Q3 extends questions{
    private double answer;
    private double hisanswer;
    Scanner in;

    public numericQuestion_Q3() {
        super.question = "What is the result of division 15 and 4 ?";
        this.answer = 3.75;
    }

    public String getQuestion() {
        return super.question;
    }
    
    public void setHisanswer() {
        in = new Scanner(System.in);
        System.out.println(this.getQuestion());
        System.out.print("Enter your answer... # ");
        this.hisanswer = in.nextDouble();
        if(math())
            System.out.println("Correct");
        else 
            System.out.println("Incorrect");
    }
    
    public boolean math(){
        boolean ans;
        return ans = (this.hisanswer == this.answer) ? true: (((this.hisanswer*100) + 1)/100 == this.answer) ? true: ((this.hisanswer*100) - 1)/100 == this.answer;
    }
}
