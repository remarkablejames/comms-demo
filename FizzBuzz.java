import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
       // get three numbers from the user and add them together
         Scanner scanner = new Scanner(System.in);
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            int thirdNumber = scanner.nextInt();
            int result = firstNumber + secondNumber + thirdNumber;
            System.out.println(result);
    }
}
