package HomeWorkSaven.Q3_4_5_6;

import java.util.Scanner;

public class anyCorrectChoiceQuestion extends questions{
    private String answer;
    private int hisanswer;
    Scanner in;
    
    public anyCorrectChoiceQuestion(){
        super.question = "What is my name ... #";
        this.answer = "Abdullah Moammer";
    }
    
    public void setHisAnswer(){
        in = new Scanner(System.in);
        System.out.println(super.question + "Choice any answer of them\n1) " + this.answer + "  2) Abdullah abdo  3) Abdullah haza");
        this.hisanswer = in.nextInt();
        
        if(this.hisanswer == 1) System.out.println("Correct");
        else System.out.println("Incorrect");
    }
}
