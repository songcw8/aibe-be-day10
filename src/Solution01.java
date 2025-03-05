import java.util.logging.Logger;

public class Solution01 {
    public static void main(String[] args) {
        ICalculator calculator = new Calculator();
        Logger logger = Logger.getLogger("calculator");
        logger.info("%d".formatted(calculator.add(1, 2)));
        logger.info("%d".formatted(calculator.subtract(3, 2)));

        ICalculatorLamda calculatorLamda = (a, b) -> a + b;
        logger.info("%d".formatted(calculatorLamda.run(5, 13)));
        ICalculatorLamda calculatorLamda2 = calculator::add;
        logger.info("%d".formatted(calculatorLamda2.run(5, 13)));
        ICalculatorLamda calculatorLamda3 = Calculator::pytagoras;
        logger.info("%d".formatted(calculatorLamda3.run(5, 12)));

    }
}

@FunctionalInterface
interface ICalculatorLamda{
    int run(int a, int b);
}

class Calculator implements ICalculator {
    public static int pytagoras(int a, int b) {
        return (int)Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

interface ICalculator{
    int add(int a, int b);
    int subtract(int a, int b);
}
