public class reverse {
    public static void main(String [] args)
    {
        int num=4,fact=1;
        for(int i=num;i>0;i--)
        {
            fact*=i;
        }
        int last=fact%10;
        if(last%2==0)
        {
        int result=reverse1(fact);
        System.out.println(result);
        }
    }
    public static int reverse1(int num)
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
