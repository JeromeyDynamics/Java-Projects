package projects.mega_calculator.GUI;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Objects;

public class JLabelOutput {
    //global variables
    static Color textColor = new Color(31, 69, 255);
    static JLabel label = new JLabel();

    /** Creates a label with just text inside of it
    @param frame The JFrame that the label will be in;
    @param outputString The text that will be displayed within the label that is being created;
     **/
    public static JFrame labelCreator(JFrame frame, String outputString) {
        //shows print for testing purposes
        System.out.println(outputString);

        //sets new label text
        System.out.println(label.getText() + " and " + label.getIcon());
        label.setText(outputString);
        System.out.println(label.getText() + " and " + label.getIcon());

        //text color
        label.setForeground(textColor);
        //text font
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        //shows if the image file used exists
        System.out.println("The image path exists?: " + new java.io.File("src/projects/mega_calculator/img/calculator.png").exists());

        frame.add(label);

        //shows the image size before using frame.pack()
        System.out.println("Size before using frame.pack(): " + frame.getSize());

        //resizes frame to fit label
        frame.pack();

        //shows the image size after using frame.pack()
        System.out.println("Size after using frame.pack(): " + frame.getSize());

        //output
        return frame;
    }

    /** Creates a label with an image where the default position of the text in relation to the image is to the middle of the image horizontally and to the bottom of the image vertically
     @param frame The JFrame that the label will be in;
     @param outputString The text that will be displayed within the label that is being created;
     @param iconImagePath The path to the image that will be displayed in the label;
     **/
    public static JFrame labelCreator(JFrame frame, String outputString, String iconImagePath) {
        //shows print for testing purposes
        System.out.println(outputString);

        //sets new label text
        label.setText(outputString);

        //makes image to display with label
        ImageIcon image = new ImageIcon(iconImagePath);
        System.out.println("Image width: " + image.getIconWidth() + "\n" + "Image height: " + image.getIconHeight());
        label.setIcon(image);
        //text position in relation to the image
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        //text color
        label.setForeground(textColor);
        //text font
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        //shows if the image file used exists
        System.out.println("The image path exists?: " + new java.io.File("src/projects/mega_calculator/img/calculator.png").exists());

        //adding the label to
        frame.add(label);

        //shows the image size before using frame.pack()
        System.out.println("Size before using frame.pack(): " + frame.getSize());

        //resizes frame to fit label
        frame.pack();

        //shows the image size after using frame.pack()
        System.out.println("Size after using frame.pack(): " + frame.getSize());

        //output
        return frame;
    }

    /** Creates a label with an image and the ability to set the position of the text in relation to the image (you can use variables of JLabel like JLabel.CENTER for the horizontal and vertical position of the text in relation to the image because those variables are of the data type int)
     @param frame The JFrame that the label will be in;
     @param outputString The text that will be displayed within the label that is being created;
     @param iconImagePath The path to the image that will be displayed in the label;
     @param horizontalPosition The horizontal position relative to the image that is in the label;
     @param verticalPosition The vertical position relative to the image that is in the label;
     **/
    public static JFrame labelCreator(JFrame frame, String outputString, String iconImagePath, int horizontalPosition, int verticalPosition) {
        //shows print for testing purposes
        System.out.println(outputString);

        //sets new label text
        label.setText(outputString);

        //makes image to display with label
        ImageIcon image = new ImageIcon(iconImagePath);
        System.out.println("Image width: " + image.getIconWidth() + "\n" + "Image height: " + image.getIconHeight());
        label.setIcon(image);
        //text position in relation to the image
        label.setHorizontalTextPosition(horizontalPosition);
        label.setVerticalTextPosition(verticalPosition);

        //text color
        label.setForeground(textColor);
        //text font
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        //shows if the image file used exists
        System.out.println("The image path exists?: " + new java.io.File("src/projects/mega_calculator/img/calculator.png").exists());

        //adding the label to
        frame.add(label);

        //shows the image size before using frame.pack()
        System.out.println("Size before using frame.pack(): " + frame.getSize());

        //resizes frame to fit label
        frame.pack();

        //shows the image size after using frame.pack()
        System.out.println("Size after using frame.pack(): " + frame.getSize());

        //output
        return frame;
    }

    //label testing
    public static void main(String[] args) {
        //JFrame set up
        JFrame frame = new JFrame("Label Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setResizable(true);

        //adds the label
        labelCreator(frame, "Heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeyyyy!", "src/projects/mega_calculator/img/calculator.png");
        labelCreator(frame, "Heeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeyyyy!");
    }
}
