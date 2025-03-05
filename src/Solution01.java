import java.util.logging.Logger;

public class Solution01 {
    public static void main(String[] args) {
        ICalculator calculator = new Calculator();
        Logger logger = Logger.getLogger("calculator");
        logger.info("%d".formatted(calculator.add(1, 2)));
    }
}

class Calculator implements ICalculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

interface ICalculator{
    int add(int a, int b);
}
