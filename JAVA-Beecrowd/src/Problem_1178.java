import java.util.Locale;
import java.util.Scanner;

public class Problem_1178 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double[] n1 = new double[99];
        for (int i = 0; i <= 99; i++){
            System.out.printf("N[%d] = %.4f%n" , i , n);
            n = n /2;
        }


        sc.close();
    }
}
