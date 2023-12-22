import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int inr =sc.nextInt();
        float total;
        total=(float) (inr *0.012);
        System.out.println("In USD "+total);
    }
}
