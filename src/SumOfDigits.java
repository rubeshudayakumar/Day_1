import java.util.Scanner;

public class SumOfDigits {
    private int number;

    private SumOfDigits(int number) {
        this.number = number;
    }

    private int getNumberOfDigits(){
        var count = 0;
        var inputNumber = this.number;
        while(inputNumber>0){
            inputNumber/=10;
            count++;
        }
        return count;
    }

    private int getSumOfDigitsUntilOne(){
        while(getNumberOfDigits() != 1){
            int sum = 0;
            int num = this.number;
            while (num > 0){
                sum+= (num % 10);
                num /= 10;
            }
            this.number = sum;
        }
        return this.number;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        SumOfDigits sumOfDigits = new SumOfDigits(number);
        System.out.println(sumOfDigits.getSumOfDigitsUntilOne());
    }
}
