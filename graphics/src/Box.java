import javax.swing.*;
import java.awt.*;


public class Box extends JPanel {

        int Box2X = 250;

        int Box2Y = 10;

//        Box(){
//
//           JButton button = new JButton("Move");
//           button.addActionListener(this);
//           add(button);
//        }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(15,15,200,200);


        g.setColor(Color.BLUE);
        g.fillRect(Box2X,Box2Y,150,150);
    }


}
