import java.util.*;
public class bubble_sort {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no of values");
        int num=scan.nextInt();
        System.out.println("enter the numbers");
        int arr[]=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=scan.nextInt();
        }
        sort(arr);
        
        for(int i:arr)
        {
            System.out.print(i);
        }
        scan.close();
    }
    static void sort(int arr[])
    {
        int n=arr.length,count=0;
        boolean swapped=false;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    swapped=true;
                    
                }
            }
            count++;
            if(!swapped) break;
        }
        System.out.println(count);

    }
}
