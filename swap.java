public class swap {
public static void main(String[] args) {
    int a=30;
    int b=50;
    int temp=a;
     a=b;
     b=temp;

    System.out.println("After Swapping: "+a);
    System.out.println("After Swapping: "+b);

    //updated Logic
    int a = 6;
    int b = 3;
    int c = 5;
     a = a + b + c;//14
      
      b = a -b -c;  //6
      c = a - b- c; //3 
      a = a - b- c; //5
      System.out.println(" "+a);//5
      System.out.println(" "+c);//3
      System.out.println(" "+b);//6
}
}
