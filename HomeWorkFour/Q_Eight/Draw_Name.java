package HomeWorkFour.Q_Eight;
import java.awt.*;
import javax.swing.JComponent;

public class Draw_Name extends JComponent{
        
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = new Rectangle();
        
        g2.setColor(Color.BLUE);
        g2.fillRect(50, 50, 150, 100);
        
        g2.setColor(Color.RED);
        g2.drawString("Abdullah_Moammer",70,100);
    }
}
