import java.util.Scanner;

public class PrimeNumber {
    private final int startingNumber;
    private final int endingNumber;

    private PrimeNumber(int startingNumber,int endingNumber){
        this.startingNumber = startingNumber;
        this.endingNumber = endingNumber;
    }

    private void printPrimeNumber(){
        for(int i = startingNumber; i <= endingNumber; i++){
            boolean isPrime = true;
            for(int j = 2; j < i/2; j++){
                if( i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = scanner.nextInt();
        int endingNumber = scanner.nextInt();

        PrimeNumber primeNumber = new PrimeNumber(startingNumber,endingNumber);
        primeNumber.printPrimeNumber();

    }
}
