package projects.calc.set_up;

import projects.calc.img.*;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class setUp {
    public static void GUISetUp() {
        JFrame frame = new JFrame();
        frame.setTitle("Mega Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(540, 900);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("calcIcon1.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xABAB5));
    }
}
