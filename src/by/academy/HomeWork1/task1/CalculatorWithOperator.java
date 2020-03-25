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
        if (a < 0) {
            return -a;
        } else {
            return a;
        }

    }

    public double square(double c, double exp) {
        double result = 1;
        for (int i = 0; i <= exp; i++) {
            result = result * c;
        }
        return result;
    }

    //result = Math.pow(c, exp);
    //  return result;


    public double sqrt(int d, int exp) {
        return square(d, 1 / exp);
        //  return d ^ exp;
        // result = Math.pow(d, (double) 1 / exp);

        // return result;
    }
}
