package HomeWorkFour;
import java.awt.*; 
import javax.swing.*;
public class Q_Ten { 
    public static void main(String[] args) {
        
        JFrame frame = new JFrame(); 
        frame.setSize(200, 200); 
        JLabel label = new JLabel("Hello,your name!");
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        frame.add(label);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setVisible(true);
    }
}
