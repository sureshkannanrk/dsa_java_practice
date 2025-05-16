public class series_add {
    public static void main(String[] args)
    {
        int num=5,add=0,add1=0;
        for(int i=1;i<=num;i++)
        {
            add+=i;
            add1+=add;
        }System.out.println(add1);
    }
}
