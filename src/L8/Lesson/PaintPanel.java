package L8.Lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class PaintPanel extends JPanel {
    private BufferedImage bim = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);

    PaintPanel(){

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bim,0,0,this);
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = bim.getGraphics();
                g.setColor(Color.RED);
                g.fillRect(e.getX(), e.getY(), 5,5);
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });


        g.setColor(Color.ORANGE);
        g.fillRect(20, 300, 100, 100);
    }
}
