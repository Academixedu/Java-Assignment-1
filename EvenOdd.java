import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(number % 2 == 0) {
            System.out.println("The number you entered "+ number + " is an even number.");
        } else {
            System.out.println("The number you entered "+ number + " is an odd number.");
        }
    }
    
}
