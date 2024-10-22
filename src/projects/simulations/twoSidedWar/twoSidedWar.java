package src.projects.simulations.twoSidedWar;

import java.util.Scanner;

public class twoSidedWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fighterTypes[] = { "archers", "swordsmen", "spearmen" };

        System.out.println("*******************************");
        System.out.println("_______Two Sided War_______");
        System.out.println("*******************************");

        for (int i = 0; i < fighterTypes.length; i++) {
            System.out.println(Integer.toString(i + 1) + ". " + fighterTypes[i]);
        }

        System.out.println("What type of fighter do you want?");
        int fighterTypeInput = scanner.nextInt();

        switch (fighterTypeInput) {
            
        }

        scanner.close();
    }
}