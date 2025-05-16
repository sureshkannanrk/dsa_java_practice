import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        System.out.print("enter a num");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int rev=0,digit;
        int goal=num;
        while(num>0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        if(rev==goal)
        {
            System.out.print("given num is palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
        scan.close();
    }
}
