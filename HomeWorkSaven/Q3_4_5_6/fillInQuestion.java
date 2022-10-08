package HomeWorkSaven.Q3_4_5_6;

import java.util.Scanner;

public class fillInQuestion extends questions{
    private String answer;
    private String hisanswer;
    Scanner in;
    
    public fillInQuestion(){
        super.question = "The inventor of Java was ... # ";
        this.answer = "James Gosling";
    }

    public void setHisanswer() {
        in = new Scanner(System.in);
        System.out.print(super.question);
        this.hisanswer = in.nextLine();
        
        if(this.hisanswer.toLowerCase().equals(this.answer.toLowerCase())){
            System.out.println("Correct");
        }
        else{
            System.out.println("incorrect");
        }
    }
    
    
}
