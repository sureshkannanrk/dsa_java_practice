public class pyramid {
    public static void main(String[] args) {

        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j=i;j<=2*i-1;j++)
            {
                System.out.print(j);
            }
            for(int j=2*i-2;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
