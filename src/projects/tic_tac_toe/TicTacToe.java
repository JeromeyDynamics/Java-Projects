package src.projects.tic_tac_toe;

//imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//the game will be a JPanel element
public class TicTacToe extends JPanel implements ActionListener {
    //logic variables
    boolean playerIsX; // tells game which players turn it is
    boolean gameDone = false; // lets the game know if the game is done
    int winner = -1; // theres no winner so the value is -1
    int player1Wins = 0, player2Wins = 0; // tells the game how many wins each player has
    int board[][] = new int[3][3]; // represents the tic-tac-toe game board

    //repeating number variables
    int lineWidth = 10; // for the lines width to separate the boxes on the board
    int lineLength = 540; // for the lines length to separate the boxes on the board
    int x = 30, y = 200; // location of the first lines starting position
    int offset = 190; // box width
    
    //stores the x and y location of each mouse click
    int a = 0, b = 5;
    int selX = 0, selY = 0;

    //colors
    Color turtleGreen = new Color(0x80bdab);
    Color orange = new Color(0xfdcb9e);
    Color offWhite = new Color(0xf7f7f7);
    Color darkGray = new Color(0x3f3f44);

    //components
    JButton playAgainButton; //the user will click this button to play again (added JButton from the javax.swing class)

    public TicTacToe() {
        //init before game
        //sets the size of the gui JPanel
        Dimension size = new Dimension(840, 600);
        
        //840 x 600 panel size and cannot be changed
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);

        //creates a play again button
        playAgainButton = new JButton("Play Again?");
        
        //listens for when the button will be clicked
        playAgainButton.addActionListener(this);

        //hides the play again button while the game is going
        getPlayAgainButton().setVisible(false);
        
    }

    public static void main(String[] args) {
        //new JFrame of the title Tic Tac Toe
        JFrame frame = new JFrame("Tic Tac Toe");
        //JFrames hold JPanels, JLabels, JButtons, etc
        frame.getContentPane();

        //creates TicTacToe object TTTPanel
        TicTacToe TTTPanel = new TicTacToe();
        //adds TicTacToe object to frame
        frame.add(TTTPanel);

        //frame set up
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adding default settings
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //will reset the game when the play again button is pressed
        resetGame();

    }

    //getter method for play again button
    public JButton getPlayAgainButton() {
        return playAgainButton;
    }

    //setter method for player 1 wins
    public void setPlayer1Wins(int wins) {
        player1Wins = wins;
    }

    //setter method for player 2 wins
    public void setPlayer2Wins(int wins) {
        player2Wins = wins;
    }

    public void resetGame() {
        //resetting variables from the beginning of the class
        playerIsX = true; // player X's turn
        winner = -1; // no winner yet
        gameDone = false; // game is restarted so the game isn't done

        //0 is empty, 1 is X, and 2 is O on the array for the board
        //setting all boxes to being empty (value = 0)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }

        //hides the play again button while the game is going
        getPlayAgainButton().setVisible(false);

    }

    //graphics
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        //draws game board with the lines and background color
        drawBoard(page);
        drawUI(page);
        // drawGame(page);

    }

    public void drawBoard(Graphics page) {
        //sets background color
        setBackground(turtleGreen);

        //sets line color
        page.setColor(darkGray);

        //makes both horizontal lines (draws line of the dark gray color as set by the line above)
        page.fillRoundRect(x, y, lineLength, lineWidth, 5, 30);
        //since offset is the space in between the boxes we simply add it to the y so that the horisontal lines are the width/length of the box away from each other
        page.fillRoundRect(x, y + offset, lineLength, lineWidth, 5, 30);
        
        //you just need to reverse the parameters of the horizontal lines to make the verticle lines
        page.fillRoundRect(y, x, lineWidth, lineLength, 30, 5);
        //since offset is the space in between the boxes we simply add it to the y so that the vertical lines are the width/length of the box away from each other
        page.fillRoundRect(y + offset, x, lineWidth, lineLength, 30, 5);

    }

    public void drawUI(Graphics page) {
        //creates a gray rectangle to the right of the screen
        page.setColor(darkGray);
        page.fillRect(600, 0, 240, 600);

        //setting the font of the words that will be put in the gray rectangle
        Font font = new Font("Helvetica", Font.PLAIN, 40);
        page.setFont(font);

        //setting the win counter which will be in the gray rectangle
        //sets the color of the text for the win counter
        page.setColor(offWhite);
        //writes the words "Win Count" in the gray rectangle
        page.drawString("Win Count", 620, 60);
        //shows the both players wins using their respective win count variables
        page.drawString(": " + player1Wins, 724, 140);
        page.drawString(": " + player2Wins, 724, 210);

        //drawing an X icon to go before the first players number of wins
        //creates an instance of the "orangex.png"
        ImageIcon xIcon = new ImageIcon("C:\\Users\\Omega\\Git Hub Repositories\\Java-Projects\\src\\projects\\tic_tac_toe\\orangex.png");
        //gets the image from the image icon because the ImageIcon was part of the javax.swing package and Image was part of the java.awt package
        Image xImg = xIcon.getImage();
        //upscales the x image
        Image newXImg = xImg.getScaledInstance(54, 54, Image.SCALE_SMOOTH);
        //puts the x icon image right in front of the score for player 1
        page.drawImage(newXImg, 658, 94, null);
    }
}