import javax.swing.*;
import java.awt.*;

public class Lab_1_4 extends JFrame {
    int x1 = 50, y1 = 200, x2 = 350, y2 = 200;
    int x = 200, y = 450;
    public static void main(String[] args) {
        Lab_1_4 lab_1_4 = new Lab_1_4();
        lab_1_4.setTitle("Алгоритм де Кастельє для побудови кривої Безьє з трьох точок");
        lab_1_4.setSize(600,600);
        lab_1_4.setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        double t = 0.1;
        while (t < 1){
            int x_ = (int) (Math.pow((1 - t), 2) * x1 + 2 * t * (1 - t) * x + Math.pow(t, 2) * x2);
            int y_ = (int) (Math.pow((1 - t), 2) * y1 + 2 * t * (1 - t) * y + Math.pow(t, 2) * y2);
            g2.drawLine(x1, y1, x_, y_);
            g2.drawLine(x_, y_, x2, y2);
            t = t + 0.01;
        }
    }
}