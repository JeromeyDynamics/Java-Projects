package src.projects.simulations.collatzConjecture;

import java.util.Scanner;

class collatzConjecture {
    public static void main(String[] args) {
        //set up
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Input the integer that would have the Collatz Conecture used on it (if the number is odd then use 3x + 1 if its even then divide the number by 2):");
       
        long inputNum = sc.nextLong();
        long ogInputNum = inputNum;

        sc.close();

        long repeats = 0;
       
        while(inputNum != 1) {
            if(inputNum % 2 == 0) {
                inputNum = inputNum * 3 + 1;
            } else {
                inputNum /= 2;
            }
            System.out.println(inputNum);
            repeats++;
        }
       
        System.out.print("The Number " + ogInputNum + " had to go through " + repeats + " changes until the number could turn into one");
    }
}