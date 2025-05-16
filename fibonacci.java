public class fibonacci {
    public static void main(String[] args)
    {
        int num=5,a=0,b=1;
        for(int i=0;i<num;i++)
        {
          System.out.print(a);
          int sum=a+b;
          a=b;
          b=sum; 
        }
    }
    
}
