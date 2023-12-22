import java.util.Objects;
import java.util.Scanner;
public class MathOp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a & b values");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Enter an Operation");
        char op=in.next().trim().charAt(0);
        if(op == '+'){
            System.out.println(a+b);
        }
        if(op == '-'){
            System.out.println(a-b);
        }
        if(op=='*'){
            System.out.println(a*b);
        }
        if(b>=1)
            if(op=='/'){
                System.out.println(a/b);
            }
        System.out.println("Divide by zero");
    }
}
