import java.util.Scanner;

public class ArmstrongNumber {
    private final int number;
    private final int digitCount;
    private final boolean isArmstrongNumber;

    private ArmstrongNumber(int number){
        this.number = number;
        this.digitCount = getNumberOfDigits();
        this.isArmstrongNumber = isArmstrongNumber();
    }

    private boolean isArmstrongNumber(){
        var inputNumber = this.number;
        int reminder,sum,digitCount;
        int sumOfAllValues = 0;
        while(inputNumber>0){
            reminder = inputNumber % 10;
            sum = 1;
            digitCount = this.digitCount;
            while (digitCount>0){
                sum *= (reminder);
                digitCount--;
            }
            sumOfAllValues+=sum;
            inputNumber/=10;
        }
        return sumOfAllValues == this.number;
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(number);
        if(armstrongNumber.getIsArmstrongNumber()){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }

    public boolean getIsArmstrongNumber(){
        return this.isArmstrongNumber;
    }
}
