import java.util.Scanner;

public class swap {
public static void main(String[] args) {
    // int a=30;
    // int b=50;
    // int temp;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of a :");
    int a=sc.nextInt();
    System.out.print("Enter the value of b :");
    int b=sc.nextInt();
    int temp;
  // Fill The Code Here
    System.out.println("Before swapping the numbers :");
    System.out.println("a="+a);
    System.out.println("b="+b);

    temp=a; // temp=30
    a=b; // a=50
    b=temp; //b=30

    System.out.println("After swqapping the numbers :");
    System.out.println("a="+a);
    System.out.println("b="+b);
}
}
