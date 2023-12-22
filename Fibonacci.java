import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,count=2;
        System.out.print(+a+ " "+b+" ");
        while(count<n){
            int temp=b;
            b=a+b;
            System.out.print(" "+b);
          a=temp;
            count++;
        }

    }

}
