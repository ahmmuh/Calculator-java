package se.codeanytime;

public class Main {

    public static void main(String[] args) {

    Calculator calculator  = (number1, number2, operator) -> {
        switch (operator){
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
            default: return  0;
        }
    };

    double result = calculator.calculate(2.2, 4.4,"+");
        System.out.println(result);
    }
}
