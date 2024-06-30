import javax.swing.*;
import java.awt.*;

public class Window {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    Window(){
        label.setBounds(0, 0, 50, 50);
        label.setFont(new Font(null,Font.ITALIC,25));
        frame.add(label);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
