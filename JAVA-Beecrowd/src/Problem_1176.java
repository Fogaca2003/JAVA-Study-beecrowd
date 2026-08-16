import java.util.Scanner;

public class Problem_1176 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++){

            int n = sc.nextInt();

            long[] n1 = new long[n + 1];

            if (n == 0){
                n1[0] = 0;
                System.out.printf("Fib(%d) = %d" , n, n1[0]);
            } else{
                n1[0] = 0;
                n1[1] = 1;
                for (int j = 2; j <= n; j++){
                    n1[j] = n1[j - 2] + n1[j -1];
                }
                System.out.printf("Fib(%d) = %d" , n, n1[n]);

            }

        }



        sc.close();
    }
}
