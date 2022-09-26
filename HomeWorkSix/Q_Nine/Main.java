package HomeWorkSix.Q_Nine;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CheckerBoard ob = new CheckerBoard();
        frame.add(ob);
        
        frame.setVisible(true);
        
    }
}
