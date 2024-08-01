package projects.mega_calculator.math_methods;

public class ComplexNumber {

    private double real, imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String printableAnswer(ComplexNumber answer) {
        if (answer.imaginary > 0) {
            return answer.real + " + " + answer.imaginary + "i";
        } else {
            return answer.real + " - " + Math.abs(answer.imaginary) + "i";
        }
    }

    public ComplexNumber add(ComplexNumber otherNumber) {
        //adding real parts
        double realSum = this.real + otherNumber.real;

        //adding imaginary parts
        double imaginarySum = this.imaginary + otherNumber.imaginary;

        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber subtract(ComplexNumber otherNumber) {
        //adding real parts
        double realDifference = this.real - otherNumber.real;

        //adding imaginary parts
        double imaginaryDifference = this.imaginary - otherNumber.imaginary;

        return new ComplexNumber(realDifference, imaginaryDifference);
    }

    public ComplexNumber multiply(ComplexNumber otherNumber) {
        //the formula is (a + bi) (c + di) = (ac - bd) + i(ad + bc)
        //the first thing to do in solving (a + bi) (c + di) is turning it into ac + iad + ibc + i2bd by multiplying both complex numbers
        //then since i^2 = -1 you can combne both the imaginary and real parts to make (ac - bd) + i(ad + bc)
        //in this case this.real is a, this.imaginary is b, otherNumber.real is c, and otherNumber.imaginary is d

        //adding real parts
        double realProduct = (this.real * otherNumber.real) - (this.imaginary * otherNumber.imaginary);

        //adding imaginary parts
        double imaginaryProduct = (this.real * otherNumber.imaginary) + (this.imaginary * otherNumber.real);

        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    public ComplexNumber divide(ComplexNumber otherNumber) {
        //the formula is (a + bi) / (c + di) = (ac + bd) / (c2 + d2) + i[(bc – ad) / (c2 + d2)] 
        //in this case this.real is a, this.imaginary is b, otherNumber.real is c, and otherNumber.imaginary is d

        //adding real parts
        double realQuotient = ((this.real * otherNumber.real) + (this.imaginary * otherNumber.imaginary)) / (Math.pow(otherNumber.real, 2) + (Math.pow(otherNumber.imaginary, 2)));

        //adding imaginary parts
        double imaginaryQuotient = ((this.imaginary * otherNumber.real) - (this.real * otherNumber.imaginary)) / (Math.pow(otherNumber.real, 2) + Math.pow(otherNumber.imaginary, 2));

        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }
}
