import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int p=in.nextInt();
       
        if(p%3==0){
        System.out.println("Even");
        }
        else{
            System.out.println("odd");

    }
    }
}

