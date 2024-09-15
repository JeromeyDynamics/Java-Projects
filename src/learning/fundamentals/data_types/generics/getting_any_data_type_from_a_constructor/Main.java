package learning.fundamentals.data_types.generics.getting_any_data_type_from_a_constructor;

public class Main {
    public static void main(String[] args) {
        //this is the constructor for the Printer class where the Integer wrapper is in place of T but, could be any other wrapper data type
        //also just like array lists that also take wrappers as the data type, the second "<>" doesn't need to be put in since it is already stated in the first "<>"
        Printer<Integer> printerForInteger = new Printer<>(128182);
        
        //prints the given number in the constructor
        printerForInteger.printTheInputtedThingToPrint();

        //another example with a string which is already a wrapper
        Printer<String> printerForDouble = new Printer<String>("I'm bus");
        printerForDouble.printTheInputtedThingToPrint();
    }
}