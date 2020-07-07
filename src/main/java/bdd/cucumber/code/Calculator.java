package bdd.cucumber.code;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int subtract(int num1, int num2) {
        return num1-num2;
    }

    public int divide(int num1, int num2) {
        return num1/num2;
    }

    public static void main(String[] args) {
        Calculator object = new Calculator();
        System.out.println("Answer: " + object.divide(49,7));
    }
}
