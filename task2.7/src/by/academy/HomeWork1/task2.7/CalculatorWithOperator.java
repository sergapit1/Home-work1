package by.academy.HomeWork1.task1;

public class CalculatorWithOperator implements ICalculator{


@Override
    public double getAdd(double a, double b) {
        return a+b;
    }
@Override
    public double getSubtr(double a, double b) {
        return a-b;
    }
@Override
    public double getMultiply(double a, double b) {
        return a*b;
    }
@Override
    public double getDiv(double a, double b) {
        return a/b;
    }
@Override
    public double getModul(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }

    }
@Override
    public double getSquare(double c, double exp) {
        double result = 1;
        for (int i = 0; i <= exp; i++) {
            result = result * c;
        }
        return result;
    }

@Override
    public double getSqrt(int d, int exp) {
        return getSquare(d, 1 / exp);

    }
}
