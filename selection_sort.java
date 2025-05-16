import java.util.*;

public class selection_sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no of values:");
        int num = scan.nextInt();
        System.out.println("enter numbers:");
        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        scan.close();
    }

    private static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min=j;
                }
            }
            int swap = arr[min];
            arr[min] = arr[i];
            arr[i] = swap;
        }
        
    }
}
