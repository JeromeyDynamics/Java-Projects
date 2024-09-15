package projects.mega_calculator.GUI;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;

public class setUp {
    public static JFrame GUISetUp() {
        JFrame frame = new JFrame();
        frame.setTitle("Mega Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900, 500);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("src/projects/mega_calculator/img/calcIcon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xABAB5));

        return frame;
    }
}
