public class factorial {
    public static void main(String[] args)
    {
        int n=5;
        int result=factorial1(n);
        System.out.println(result);
    }
    public static int factorial1( int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else{
            return n*factorial1(n-1);
        }
        

    }
}
