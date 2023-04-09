import javax.swing.*;
import java.awt.*;

public class Lab_1_1 extends JFrame {
    int x1 = 400, y1 = 400, x2 = 700, y2 = 600;
    public static void main(String[] args) {
        Lab_1_1 lab_1_1 = new Lab_1_1();
        lab_1_1.setSize(500,500);
        lab_1_1.setTitle("Алгоритм Брезенхема для побудови прямої лінії");
        lab_1_1.setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.GREEN);
        int l, dy, S, m, n;
        if(x1 > x2){
            S = x1;
            x1 = x2;
            x2 = S;
            S = y1;
            y1 = y2;
            y2 = S;
        }
        if(y1 > y2){
            dy = -1;
        }
        else {
            dy = 1;
        }
        m = Math.abs(y2 - y1);
        n = x2 - x1;
        S = m - n;
        l = Math.max(m, n);
        m = m + m;
        n = n + n;
        g.drawLine(x1, y1, 1, 1);
        for (int k = 0; k == l; k++){
            if(S <= 0){
                S = S + m;
                x1 = x1 + 1;
            }
            if (S > 0){
                S = S - n;
                y1 = y1 + dy;
            }
            g.drawLine(x1, y1, 1, 1);
        }
    }
}