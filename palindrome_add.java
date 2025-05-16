import java.util.Scanner;
public class palindrome_add {
    public static void main(String[] args)
    {
        System.out.print("enter the number");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int goal=num,count=1;
        int result=reverse(num);
        System.out.println(result);
        while(result!=goal)
        {
            result+=goal;
            goal=reverse(result);
            count++;
        }
        System.out.println("its founded at "+count+"th time");
        scan.close();
    }
    public static int reverse(int num)
    {
        int rev=0,digit;
        while(num>0)
        {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev;
    }
}
