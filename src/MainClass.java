import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainClass implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();

    MainClass(){
        button.setBounds(100, 150, 200, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args){
MainClass mainClass = new MainClass();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
           Window window = new Window();
        }

    }
}
