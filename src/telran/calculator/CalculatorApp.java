package telran.calculator;

import telran.calculator.model.Calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        //To add new operation you may call here the method addOperation
        //with string that presents the name of operation
        //that you will input in command line
        //and lambda expression that presents math operation
        //like in the following example
        Calculator.addOperation("multiply",(a,b) -> a * b);

        double a,b;
        try {
            a = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println(args[0] + " is incorrect value");
            return;
        }
        try {
            b = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println(args[1] + " is incorrect value");
            return;
        }
        try {
            System.out.println("Result is " + Calculator.calculate(a,b,args[2]));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
