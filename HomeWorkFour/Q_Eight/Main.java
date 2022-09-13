package HomeWorkFour.Q_Eight;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Draw_Name Name = new Draw_Name();
        frame.add(Name);
        
        frame.setVisible(true);
    }
}
