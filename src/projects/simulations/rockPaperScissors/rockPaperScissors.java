package src.projects.simulations.rockPaperScissors;

import java.util.*;

public class rockPaperScissors {
    public static void main(String[] args) {
        
        //init contructors
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        //will play rock paper scissor shoot (rock = 0, paper = 1, scissor = 2)
        int botA  = rand.nextInt(3);
        int botB  = rand.nextInt(3);

        //init variables
        //botA would be on the left and botB would be on the top (scores are from the perspective of botA)
        /*            will track the wins
                     rock   paper   scissors
                      ________________
        rock       l tie  l   lose  l   win    l
                      l___l______l_____l
        paper     l win  l   tie    l  lose   l
                     l____l______l_____l
        scissors l lose l   win   l  tie     l
                     l____l_____l______l  */

        int gameWinTable[][] = new int[3][3]; 

        boolean continuing = false;
        
        //init prints
        System.out.println("***********************************");
        System.out.println("___Rock Paper Scissors Simulation___");
        System.out.println("***********************************");

        do {
            //chose side
            System.out.println("Pick one (1-3):");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");

            int sideInput = scanner.nextInt();

            System.out.println("How many simulations do you want to do?:");
            int simulationNumInput = scanner.nextInt();

            //simulation
            for (int i = 0; i < simulationNumInput; i++) {
                //who wins
                gameWinTable[botB][botA]++;

                //prints
                System.out.print("Rock wins: " + gameWinTable[2][0] + '\t');
                System.out.print("Paper wins: " + gameWinTable[0][1] + '\t');
                System.out.print("Scissors wins: " + gameWinTable[1][2] + '\n' + 
                "__________________________________________________" + '\n');

                //end actions
                botA  = rand.nextInt(3);
                botB  = rand.nextInt(3);
            }

            //showing stats
            
            
            //winner
            
            
            //repeats simulation
            System.out.println("Would you like to do another simulation? (y/n):");
            char ifContinuing = scanner.next().charAt(0);

            if (Character.compare(ifContinuing, 'y') == 0) {
                continuing = true;
            } else if (Character.compare(ifContinuing, 'n') == 0) {
                continuing = false;
            }
        } while (continuing == true);
        scanner.close();
        
    }
}
