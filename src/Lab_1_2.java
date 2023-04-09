import javax.swing.*;
import java.awt.*;

public class Lab_1_2 extends JFrame {
    int center_x = 250, center_y = 270, radius = 210;
    public static void main(String[] args) {
        Lab_1_2 lab_1_2 = new Lab_1_2();
        lab_1_2.setTitle("Алгоритм Брезенхема для побудови кола");
        lab_1_2.setSize(500,500);
        lab_1_2.setVisible(true);
    }
    public void paint(Graphics g){
        super.paint(g);
        int x = 0, y = radius, d = 3 - 2 * radius;
        while (x <= y){
            put_pixel(g, x, y);
            if(d < 0){
                d = d + 4 * x + 6;
            }
            else {
                d = d + 4 * (x - y) + 10;
                y--;
            }
            x++;
        }
    }
    private void put_pixel(Graphics g, int x, int y){
        g.setColor(Color.ORANGE);
        g.fillRect(center_x + x, center_y + y, 2, 2); // товщина 2
        g.fillRect(center_x + y, center_y + x, 2, 2);
        g.fillRect(center_x - x, center_y + y, 2, 2);
        g.fillRect(center_x - y, center_y + x, 2, 2);
        g.fillRect(center_x + x, center_y - y, 2, 2);
        g.fillRect(center_x + y, center_y - x, 2, 2);
        g.fillRect(center_x - x, center_y - y, 2, 2);
        g.fillRect(center_x - y, center_y - x, 2, 2);
    }
}