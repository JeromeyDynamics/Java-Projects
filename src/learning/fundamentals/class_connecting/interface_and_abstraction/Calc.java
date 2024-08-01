package learning.fundamentals.class_connecting.interface_and_abstraction;

public class Calc implements Transform {

    @Override
    public double intToDoubleConverter(int numberToTransformIntoADouble) {
        //implicitly turns the number to transform into a double because double is the return value
        //other ways to turn it into a double would be to put "(double)" in front of the variable or to use
        //"Double.valueOf(the_variable)" but, both are redundant
        return numberToTransformIntoADouble;
    }

    public static double sum(Transform transform) {
        return 0;
    }
}