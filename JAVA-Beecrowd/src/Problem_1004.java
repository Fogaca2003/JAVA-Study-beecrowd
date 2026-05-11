import java.util.Locale;
import java.util.Scanner;

public class Problem_1004 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;
        A = sc.nextInt();
        B = sc.nextInt();
        PROD = A * B;

        System.out.printf("PROD = %d%n" , PROD);

        sc.close();
    }
}
