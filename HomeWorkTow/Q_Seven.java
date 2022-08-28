package HomeWorkTow;

public class Q_Seven {
    public static void main(String[] args) {
        StringBuilder Text = new StringBuilder("Text");
        
        // Get The First Character
        System.out.println(Text.charAt(0));
        
        // Get The Last Character
        System.out.println(Text.charAt(3));
        
        // Remove The First Character
        Text.deleteCharAt(0);
        
        // Remove The Last Character
        Text.deleteCharAt(2);
        
        // Chek
        System.out.println(Text);
    }
}
