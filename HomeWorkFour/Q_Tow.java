package HomeWorkFour;

public class Q_Tow {
    public static void main(String[] args) {
        
        String text = "Mississippi";
        
        System.out.println
        ("The text is : " + text + "\nNow i will replace each letter \"i\" with the letter \"ii\"");
        
        text = text.replace("i", "ii");
        
        System.out.println("The text after modification is : " + text + "\nNow i will replace each letter \"ss\" with the letter \"s\"");
        
        text = text.replaceAll("ss", "s");
        
        System.out.println("The text after modification is : " + text);
    }
}
