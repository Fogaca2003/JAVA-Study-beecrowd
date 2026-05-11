import java.util.Locale;
import java.util.Scanner;

public class Problem_1006 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double media = (A * 2 + B * 3 + C * 5) / 10.0;

        System.out.printf("MEDIA = %.1f%n" , media);

        sc.close();

    }
}
