public class swap {
public static void main(String[] args) {
    int a=30;
    int b=50;
    int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("Value of a is : "+a);
    System.out.println("Value of b is : "+b);
    System.out.println();

    //without using third variable
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Value of a is : "+a);
    System.out.println("Value of b is : "+b);

}
}
