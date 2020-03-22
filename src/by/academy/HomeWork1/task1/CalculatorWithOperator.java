package by.academy.HomeWork1.task1;

public class CalculatorWithOperator {
    public double result;

    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    public double subtr(double a, double b) {
        result = a - b;
        return result;
    }

    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    public double div(double a, double b) {
        result = a / b;
        return result;
    }

    public double modul(double a) {
        result = Math.abs(a);
        return result;
    }

    public double square(double c, double exp) {
        result = Math.pow(c, exp);
        return result;
    }

    public double sqrt(double d, double exp) {
        result = Math.pow(d, (double) 1 / exp);
        return result;
    }
}
