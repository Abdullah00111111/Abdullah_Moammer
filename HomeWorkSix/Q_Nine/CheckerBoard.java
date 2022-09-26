package HomeWorkSix.Q_Nine;
import java.awt.*;
import javax.swing.JComponent;
public class CheckerBoard extends JComponent{
    
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        int x=0, y=0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                g2.setColor(Color.BLACK);
                g2.fillRect(x, y, 50, 50);
                y+=50;
                g2.setColor(Color.LIGHT_GRAY);
                g2.fillRect(x, y, 50, 50);
                y+=50;
            }
            x+=50;
            y=0;
            for(int j=0; j < 4; j++){
                g2.setColor(Color.LIGHT_GRAY);
                g2.fillRect(x, y, 50, 50);
                y+=50;
                g2.setColor(Color.BLACK);
                g2.fillRect(x, y, 50, 50);
                y+=50;
            }
            x+=50;
            y=0;
        }
        
    }
    
}
