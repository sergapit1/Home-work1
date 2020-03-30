package by.academy.HomeWork1.task1;

public class CalculatorWithCounter implements ICalculator{
    private ICalculator calc;
    private int countOperation = 0;

    public CalculatorWithCounter(ICalculator calc) {
        this.countOperation++;
        this.calc = calc;
    }

    public int getCountOperation() {
        return countOperation;
    }

    @Override
    public double getAdd(double a, double b) {
        this.countOperation++;
        return calc.getAdd(a, b);
    }

    @Override
    public double getSubtr(double a, double b) {
        this.countOperation++;
        return calc.getSubtr(a, b);
    }

    @Override
    public double getMultiply(double a, double b) {
        this.countOperation++;
        return calc.getMultiply(a, b);
    }

    @Override
    public double getDiv(double a, double b) {
        this.countOperation++;
        return calc.getDiv(a, b);
    }

    @Override
    public double getSquare(double a, double exp) {
        this.countOperation++;
        return calc.getSquare(a, exp);
    }

    @Override
    public double getModul(double a) {
        this.countOperation++;
        return calc.getModul(a);
    }


    @Override
    public double getSqrt(int d, int exp) {
        this.countOperation++;
        return Math.pow(d, (double) 1 / exp);
    }
}