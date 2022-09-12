package HomeWorkFour;

public class Q_Three {
    public static void main(String[] args) {
        
        String text = "Mississippi";
        System.out.println("ReplaceTester program...\nthe text is : " + text + "Now i will encrypt it...");
        
        System.out.println("The old text is : " + text);
        
        text = text.replace("i", "!");
        text = text.replace("ss", "$$");
        
        System.out.println("The new text is : " + text);
    }
}
