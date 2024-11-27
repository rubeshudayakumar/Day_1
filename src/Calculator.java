import java.util.Scanner;

public class Calculator {

    private final Operation operation;
    private final int firstNumber;
    private final int secondNumber;

    private Calculator(String operation, int firstNumber, int secondNumber){
        this.operation = Operation.valueOf(operation.toUpperCase());
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    private static enum Operation{
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        MODULO
    }

    private void calculate(){
        switch (this.operation) {
            case ADD ->{
                System.out.println(this.firstNumber + this.secondNumber);
            }
            case SUBTRACT ->{
                System.out.println(this.firstNumber - this.secondNumber);
            }
            case MULTIPLY ->{
                System.out.println(this.firstNumber * this.secondNumber);
            }
            case DIVIDE -> {
                System.out.println(this.firstNumber / this.secondNumber);
            }
            case MODULO -> {
                System.out.println(this.firstNumber % this.secondNumber);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;
        int firstNumber, secondNumber;
        operation = scanner.next();
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator(operation,firstNumber,secondNumber);
        calculator.calculate();

    }
}
