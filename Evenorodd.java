import java.util.Scanner;

public class Evenorodd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=0;i<=10;i++){
            if (i%2==0){
                System.out.println(i+"=even");}
            else{
                System.out.println(i+"=odd");
            }
            }
        }
    }

