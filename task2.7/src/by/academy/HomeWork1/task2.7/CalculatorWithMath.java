package by.academy.HomeWork1.task1;

public class CalculatorWithMath implements ICalculator {

    @Override
    public double getAdd(double a, double b) {
        return a + b;
    }

    @Override
    public double getSubtr(double a, double b) {
        return a - b;
    }

    @Override
    public double getMultiply(double a, double b) {
        return a * b;
    }

    @Override
    public double getDiv(double a, double b) {
        return a / b;
    }

    @Override
    public double getModul(double a) {
       return Math.abs(a);


    }

    @Override
    public double getSquare(double c, double exp) {
       return Math.pow(c, exp);
    }

    @Override
    public double getSqrt(int d, int exp) {

         return Math.pow(d, (double) 1 / exp);

    }

}
