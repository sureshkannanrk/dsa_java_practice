import java.util.*;
public class HeapSort {
    public static void main(String[] args)
    {
        
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the no.of:");
        int num=scan.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=scan.nextInt();
        }
        maxheap(arr);
        for(int value:arr) System.out.print(value + " ");
        scan.close();
    }
    static int[] maxheap(int arr[])
    {
        int len=arr.length;
        for(int i=len/2-1;i>=0;i--)
        {
            heapify(arr,len,i);
        }
        for(int i=len-1;i>0;i--)
        {
            int swap=arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            heapify(arr,i,0);
        }
        return arr;
    }
    static int[] heapify(int arr[],int n,int i)
    {
        int lar=i,left=2*i+1,right=2*i+2;
        if(left<n && arr[left]>arr[lar])
        {
            lar=left;
        }
        if(right<n && arr[right]>arr[lar])
        {
            lar=right;
        }
        if(lar!=i)
        {
            int swap=arr[i];
            arr[i]=arr[lar];
            arr[lar]=swap;
            heapify(arr,n,lar);
        }
        return arr;
    }
}