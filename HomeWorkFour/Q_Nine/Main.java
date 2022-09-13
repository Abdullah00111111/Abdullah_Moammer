package HomeWorkFour.Q_Nine;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Traffic_Light ob = new Traffic_Light();
        frame.add(ob);
        
        frame.setVisible(true);
    }
}
