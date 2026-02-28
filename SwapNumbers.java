import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = a;
        System.out.println("After Swapping:- ");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
