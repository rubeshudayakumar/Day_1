import java.util.Scanner;

public class TrianglePattern {

    private int number;

    private TrianglePattern(int number) {
        this.number = number;
    }

    private void printPattern(){
        for(int i = 1; i <= this.number; i++){
            for(int j = 1; j < this.number - i + 1; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int k = 1; k <= i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        TrianglePattern trianglePattern = new TrianglePattern(number);
        trianglePattern.printPattern();
    }
}
