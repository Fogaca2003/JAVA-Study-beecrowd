import java.util.Locale;
import java.util.Scanner;

public class Problem_1014 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int total_distance;
        double fuel_consumed, kmL;

        total_distance = sc.nextInt();
        fuel_consumed = sc.nextDouble();

        kmL = (double) total_distance / fuel_consumed;

        System.out.printf("%.3f km/l%n", kmL);

        sc.close();
    }
}
