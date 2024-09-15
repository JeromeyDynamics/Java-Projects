package learning.java_gui.javax_swing;

import javax.swing.JOptionPane;

public class JOption_Pane {
    public static void main(String[] args) {
        //shows input message
        String name = JOptionPane.showInputDialog("Enter your name");
        //shows output message (the first parameter is null because there is no JFrame so a template JFrame is used)
        JOptionPane.showMessageDialog(null, "Hello "+name);

        //shows input message and then turns it into an integer using Integer.parseInt()
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        //displays output depending on the age
        if (age <= 100) {
            JOptionPane.showMessageDialog(null, "You are " + (100 - age) + " years away from turning 100!");
        } else {
            JOptionPane.showMessageDialog(null, "Wow you are " + age + " years old!");
        }

        //shows input message and then turns it into an double using Double.parseDouble()
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in ft"));
        //displays the output message
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
    }
}
