package by.academy.HomeWork1.task1;

public class Main {
    public static void main(String[] args) {


        CalculatorWithOperator calculator = new CalculatorWithOperator();
        float result;
        float result1;

        //  вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2

        result = (float) calculator.getAdd((
                        calculator.getAdd(
                                calculator.getMultiply(15, 7),                               //  15 * 7 +
                                calculator.getSquare(calculator.getDiv(28, 5), 2))),       //  (28 / 5) ^ 2
                4.1);                                                                        //    4.1 +
        System.out.println("Result: " + result);
        result1 = result/0;
        System.out.println("Result / 0 :" + result1);
        result1 = (float) (result/ 0.0d);
        System.out.println(result1);

    }
}