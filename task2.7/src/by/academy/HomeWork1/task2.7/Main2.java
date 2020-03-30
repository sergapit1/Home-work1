package by.academy.HomeWork1.task1;

public class Main2 {
    public static void main(String[] args) {
        float result1;
        float result2;

        ICalculator calc1 = new CalculatorWithCounter(new CalculatorWithMath());
        ICalculator calc2 = new CalculatorWithCounter(new CalculatorWithOperator());

        //  вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2

        result1 = (float) calc1.getAdd((calc1.getAdd(calc1.getMultiply(15, 7), calc1.getSquare(calc1.getDiv(28, 5), 2))), 4.1);
        result2 = (float) calc2.getAdd((calc2.getAdd(calc2.getMultiply(15, 7), calc2.getSquare(calc2.getDiv(28, 5), 2))), 4.1);
        System.out.println(result1);
        System.out.println(result2);


    }
}
