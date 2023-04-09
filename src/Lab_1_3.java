import javax.swing.*;
import java.awt.*;

public class Lab_1_3 extends JFrame {
    public static void main(String[] args) {
        Lab_1_3 lab_1_3 = new Lab_1_3();
        lab_1_3.setTitle("Побудова дуги еліпса");
        lab_1_3.setSize(500,500);
        lab_1_3.setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.MAGENTA);
        g2.setStroke(new BasicStroke(3));
        g2.drawArc(100, 100, 300, 200, 0, 180 );
    }
}