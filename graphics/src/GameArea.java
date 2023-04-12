import javax.swing.*;
import javax.swing.Box;

public class GameArea {
    JFrame frame = new JFrame();
    Box box = new Box();

    GameArea(){
        frame.add(box);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(600,600);
        frame.setVisible(true);

    }

}
