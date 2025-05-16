import java.util.Scanner;
public class reverse01 {
    public static void main(String[] args)
    {
        System.out.print("enter the num:");
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        int digit,rev=0;
        while(num>0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("your reverse num is:"+rev);
        scan.close();
    }
}
