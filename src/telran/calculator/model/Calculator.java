package telran.calculator.model;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    public static Map<String, Executor> operations = new HashMap<>() {
        {
            put("add", (a, b) -> a + b);
            put("subtract", (a, b) -> a - b);
        }
    };

    public static double calculate(double a, double b, String operation) throws Exception {
        Executor executor = operations.get(operation);
        if (executor == null) {
            throw new Exception("There is no such operation");
        }
        return executor.execute(a, b);
    }

    public static void addOperation(String name, Executor operation) {
        operations.put(name, operation);
    }
}
