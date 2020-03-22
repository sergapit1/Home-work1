package by.academy.HomeWork1.task1;

public class Main {
    public static void main(String[] args) {


        CalculatorWithOperator calculator = new CalculatorWithOperator();
        float result;
        // calculator.add();
        //  calculator.subtr();
        //  calculator.multiply();
        // calculator.div();
        // calculator.modul();
        // calculator.square();
        // calculator.sqrt();
        //  вичислить результат выражения 4.1 + 15 * 7 + (28 / 5) ^ 2

        result = (float) calculator.add((
                        calculator.add(
                                calculator.multiply(15, 7),                               //  15 * 7 +
                                calculator.square(calculator.div(28, 5), 2))),       //  (28 / 5) ^ 2
                4.1);                                                                        //    4.1 +
        System.out.println("Result: " + result);
    }
}