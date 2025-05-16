import java.util.*;
public class MergeSort{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int num = scan.nextInt();
        int arr[] =new int[num];
        System.out.println("enter the values");
        for(int i=0;i<num;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
        arr=sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sort(int[] input)
    {
        if(input.length <2)
        {
            return input;
        }
        int mid=input.length/2;
        int[] lefthalf = sort(Arrays.copyOfRange(input,0,mid));
        int[] righthalf= sort(Arrays.copyOfRange(input,mid,input.length));
        return merge(lefthalf,righthalf);
    }
    public static int[] merge(int[] first, int[] second)
    {
        int mix[]= new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                i++;
            }
            else
            {
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length)
        {
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length)
        {
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}