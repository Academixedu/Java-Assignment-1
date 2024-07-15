
import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("befor swapping x=");
        int x=sc.nextInt();
        System.err.println("before swapping y=");
        int y=sc.nextInt();
        System.out.println("after swaaping:");
        int temp=x;
        x=y;
        y=temp;
        System.out.println("After swapping x="+x);
        System.out.println("After Swapping y="+y);
    }}

