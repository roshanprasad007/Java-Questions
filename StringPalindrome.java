import java.util.Scanner;
public class StringPalindrome{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String revName="";
        char ch;
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            revName=ch+revName;
        }
        System.out.println(revName);
        if(name.equals(revName))
        {
            System.out.println("Palindrome");
        }
   }
}