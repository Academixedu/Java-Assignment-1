public class Swapping_without_temp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swapping : a = " + a + " b = " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("after swapping : a = " + a + " b = " + b);
    }
}
