package HomeWorkFour;
import javax.swing.JFrame;
import java.awt.*;
public class Q_Saven extends JFrame{
    
    public Q_Saven (){
        setTitle("Q_Saven");
        setSize(900, 900);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void paint (Graphics g){
        g.setColor(Color.PINK);
        g.fillRect(300, 300, 200, 100);
        g.setColor(Color.MAGENTA);
        g.fillRect(200, 200, 200, 100);
    }
    
    public static void main(String[] args) {
        
        Q_Saven ob = new Q_Saven();
        
        ob.paint(null);
    }
}
