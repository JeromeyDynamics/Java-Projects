package data_types.generics.getting_any_data_type_from_a_constructor;

//doesn't have to be T but, most use it to mean type
public class Printer <T> {
    //variable that can be of any wrapper data type
    T inputtedThingToPrint;

    public Printer(T inputtedThingToPrint) {
        this.inputtedThingToPrint = inputtedThingToPrint;
    }

    public void printTheInputtedThingToPrint() {
        System.out.println(inputtedThingToPrint);
    }
}
