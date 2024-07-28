package projects.calc;

//class imports in file hierarchy
import calc.math_methods.ComplexNumber;
import projects.calc.set_up.setUp;

//gui imports

//java object imports
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        //init methods
        setUp.GUISetUp();

        // init variables
        boolean continuing = false;
        boolean continuingUsingProgram = false;
        int savedUserInputFormulaNumber = -1;
        int i = 0;

        // intro
        frame.showMessageDialog(null, "*********************************************\n" + "___________Calculator___________\n" + "*********************************************");

        while (continuing || i == 0) {
            i += 1;
            continuing = false;
            int userInputFormulaNumber = savedUserInputFormulaNumber;

            if (continuingUsingProgram == false) {

                // user input
                userInputFormulaNumber = Integer.parseInt(JOptionPane.showInputDialog("""
                        ___Choose a calculation to make___
                        1. Minimum Number
                        2. Maximum Number
                        3. Average Number
                        4. Median Number
                        5. Standard Deviation of Numbers
                        6. Variance of Numbers
                        7. Complex Number
                        
                        Which numbered problem do you want to solve for?"""));
            }

            String userInputAddedNumber;

            switch (userInputFormulaNumber) {
                case 1:
                    ArrayList<Double> minArray = new ArrayList<Double>();

                    do {
                        // prints
                        userInputAddedNumber = JOptionPane.showInputDialog(
                                "Do you want to add a new number (must have at least one number, just add the number that you want to add, enter q if you want to stop adding numbers)?");

                        if (userInputAddedNumber.equals("q")) {
                            break;
                        } else {
                            if (!userInputAddedNumber.isEmpty()) {
                                double userInputAddedNumberAsDouble = Double.parseDouble(userInputAddedNumber);

                                minArray.add(userInputAddedNumberAsDouble);
                            }
                        }
                    } while (!userInputAddedNumber.isEmpty());

                    JOptionPane.showMessageDialog(null, "Array of numbers: " + minArray + '\n' + min(minArray));

                    break;
                case 2:
                    ArrayList<Double> maxArray = new ArrayList<Double>();

                    do {
                        // prints
                        userInputAddedNumber = JOptionPane.showInputDialog(
                                "Do you want to add a new number (must have at least one number, just add the number that you want to add, enter q if you want to stop adding numbers)?");

                        if (userInputAddedNumber.equals("q")) {
                            break;
                        } else {
                            if (!userInputAddedNumber.isEmpty()) {
                                double userInputAddedNumberAsDouble = Double.parseDouble(userInputAddedNumber);

                                maxArray.add(userInputAddedNumberAsDouble);
                            }
                        }
                    } while (!userInputAddedNumber.isEmpty());

                    JOptionPane.showMessageDialog(null, "Array of numbers: " + maxArray + '\n' + max(maxArray));

                    break;
                case 3:
                    ArrayList<Double> meanArray = new ArrayList<Double>();

                    do {
                        // prints
                        userInputAddedNumber = JOptionPane.showInputDialog(
                                "Do you want to add a new number (must have at least one number, just add the number that you want to add, enter q if you want to stop adding numbers)?");

                        if (userInputAddedNumber.equals("q")) {
                            break;
                        } else {
                            if (!userInputAddedNumber.isEmpty()) {
                                double userInputAddedNumberAsDouble = Double.parseDouble(userInputAddedNumber);

                                meanArray.add(userInputAddedNumberAsDouble);
                            }
                        }
                    } while (!userInputAddedNumber.isEmpty());

                    JOptionPane.showMessageDialog(null, "Array of numbers: " + meanArray + '\n' + mean(meanArray));

                    break;
                case 4:
                    ArrayList<Double> medianArray = new ArrayList<Double>();

                    do {
                        // prints
                        userInputAddedNumber = JOptionPane.showInputDialog(
                                "Do you want to add a new number (must have at least one number, just add the number that you want to add, enter q if you want to stop adding numbers)?");

                        if (userInputAddedNumber.equals("q")) {
                            break;
                        } else {
                            if (!userInputAddedNumber.isEmpty()) {
                                double userInputAddedNumberAsDouble = Double.parseDouble(userInputAddedNumber);

                                medianArray.add(userInputAddedNumberAsDouble);
                            }
                        }
                    } while (!userInputAddedNumber.isEmpty());

                    JOptionPane.showMessageDialog(null, "Array of numbers: " + medianArray + '\n' + median(medianArray));

                    break;

                case 5:
                    ArrayList<Double> standardDeviationArray = new ArrayList<Double>();

                    do {
                        // prints
                        userInputAddedNumber = JOptionPane.showInputDialog(
                                "Do you want to add a new number (must have at least one number, just add the number that you want to add, enter q if you want to stop adding numbers)?");

                        if (userInputAddedNumber.equals("q")) {
                            break;
                        } else {
                            if (!userInputAddedNumber.isEmpty()) {
                                double userInputAddedNumberAsDouble = Double.parseDouble(userInputAddedNumber);

                                standardDeviationArray.add(userInputAddedNumberAsDouble);
                            }
                        }
                    } while (!userInputAddedNumber.isEmpty());

                    JOptionPane.showMessageDialog(null, "Array of numbers: " + standardDeviationArray + '\n' + standardDeviation(standardDeviationArray));

                    break;
                case 6:
                    ArrayList<Double> varianceArray = new ArrayList<Double>();

                    do {
                        // prints
                        userInputAddedNumber = JOptionPane.showInputDialog(
                                "Do you want to add a new number (must have at least one number, just add the number that you want to add, enter q if you want to stop adding numbers)?");

                        if (userInputAddedNumber.equals("q")) {
                            break;
                        } else {
                            if (!userInputAddedNumber.isEmpty()) {
                                double userInputAddedNumberAsDouble = Double.parseDouble(userInputAddedNumber);

                                varianceArray.add(userInputAddedNumberAsDouble);
                            }
                        }
                    } while (!userInputAddedNumber.isEmpty());

                    JOptionPane.showMessageDialog(null, "Array of numbers: " + varianceArray + '\n' + variance(varianceArray));

                    break;
                case 7:
                    double real1, imaginary1, real2, imaginary2;

                    real1 = Double.parseDouble(JOptionPane.showInputDialog("What is the real number that you want to add of the first complex number (just the number)?"));

                    imaginary1 = Double.parseDouble(JOptionPane.showInputDialog("What is the imaginary number that you want to add of the first complex number (just the number)?"));

                    real2 = Double.parseDouble(JOptionPane.showInputDialog("What is the real number that you want to add of the second complex number (just the number)?"));

                    imaginary2 = Double.parseDouble(JOptionPane.showInputDialog("What is the imaginary number that you want to add of the second complex number (just the number)?"));

                    String complexNumberType = JOptionPane.showInputDialog("What would you like to do with the two complex numbers " + real1 + " + " + imaginary1 + "i and " +
                            real2 + " + " + imaginary2 + "i (add, subtract, multiply, divide)?");

                    ComplexNumber complexNumber1 = new ComplexNumber(real1, imaginary1);
                    ComplexNumber complexNumber2 = new ComplexNumber(real2, imaginary2);

                    switch(complexNumberType) {
                        case "add":
                            ComplexNumber sum = complexNumber1.add(complexNumber2);
                            JOptionPane.showMessageDialog(null, sum.printableAnswer(sum));

                            break;
                        case "subtract":
                            ComplexNumber difference = complexNumber1.subtract(complexNumber2);
                            JOptionPane.showMessageDialog(null, difference.printableAnswer(difference));

                            break;
                        case "multiply":
                            ComplexNumber product = complexNumber1.multiply(complexNumber2);
                            JOptionPane.showMessageDialog(null, product.printableAnswer(product));

                            break;
                        case "divide":
                            ComplexNumber quotient = complexNumber1.divide(complexNumber2);
                            JOptionPane.showMessageDialog(null, quotient.printableAnswer(quotient));

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "The type of formula used on the complex numbers was inputted wrong: " + complexNumberType);
                    }

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Your formula doesn't exist in this program, please restart!");
            }

            int endOfProgramOptions = Integer.parseInt(JOptionPane.showInputDialog("""
                        Choose 1 of the options:
                        1. Use this same formula
                        2. Use another formula
                        3. Exit program"""));

            switch (endOfProgramOptions) {
                case 1:
                    continuing = true;
                    continuingUsingProgram = true;
                    savedUserInputFormulaNumber = userInputFormulaNumber;

                    break;
                case 2:
                    continuing = true;
                    continuingUsingProgram = false;

                    break;
                case 3:
                    continuing = false;
                    continuingUsingProgram = false;

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "You need to put an available answer!");
            }
        }
    }

    // ___MATH FUCTIONS___
    public static String min(ArrayList<Double> nums) {
        // sorted for easier math
        Collections.sort(nums);
        double min = nums.getFirst();
        min = (double) Math.round(min * 1000d) / 1000d;
        return "min: " + min;
    }

    public static String max(ArrayList<Double> nums) {
        // sorted for easier math
        Collections.sort(nums);
        double max = nums.get(nums.size() - 1);
        max = (double) Math.round(max * 1000d) / 1000d;
        return "max: " + max;
    }

    public static String mean(ArrayList<Double> nums) {
        // sorted for easier math
        Collections.sort(nums);
        double mean = 0;
        for (double a : nums) {
            mean += a;
        }
        mean /= nums.size();
        mean = (double) Math.round(mean * 1000d) / 1000d;
        return "mean: " + mean;
    }

    public static String median(ArrayList<Double> nums) {
        // sorted for easier math
        Collections.sort(nums);
        double median = 0;
        if (nums.size() % 2 == 0) {
            median = (nums.get(nums.size() / 2) + nums.get(nums.size() / 2 - 1)) / 2;
        } else {
            median = nums.get(nums.size() / 2);
        }
        median = (double) Math.round(median * 1000d) / 1000d;
        return "median: " + median;
    }

    public static String standardDeviation(ArrayList<Double> nums) {
        // mean
        double mean = 0;
        for (double a : nums) {
            mean += a;
        }
        mean /= nums.size();
        mean = (double) Math.round(mean * 1000d) / 1000d;
        // standard deviation
        double sd = 0;
        for (Double num : nums) {
            sd += Math.pow(num - mean, 2);
        }
        sd /= nums.size();
        sd = Math.sqrt(sd);
        sd = (double) Math.round(sd * 1000d) / 1000d;
        return "standard deviation: " + sd;
    }

    // not sure if the answers are right
    public static String variance(ArrayList<Double> nums) {
        double mean = 0;
        for (double a : nums) {
            mean += a;
        }
        mean /= nums.size();
        mean = (double) Math.round(mean * 1000d) / 1000d;
        // standard deviation
        double variance = 0;
        for (Double num : nums) {
            variance += Math.pow(num - mean, 2);
        }
        variance /= nums.size();
        variance = (double) Math.round(variance * 1000d) / 1000d;
        return "variance: " + variance;
    }

    public static String complexNumber(ArrayList<Double> nums) {
        double complexNumber = 0;
        double a = nums.get(0);
        double b = nums.get(1);

        complexNumber = a + b;

        return "complex number: " + complexNumber;
    }
}