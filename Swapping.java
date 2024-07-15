import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        a=a+b;
        System.out.println(a);
        b=a-b;
        System.out.println("After the swap the value of b:" +b);

        a=a-b;
        System.out.println("After the swap the value of a :" +a);
        
        
    
}
}
