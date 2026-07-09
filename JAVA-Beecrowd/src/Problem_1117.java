import java.util.Locale;
import java.util.Scanner;

public class Problem_1117 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = -1;
        double n2 = -1;

        while (n1 < 0 || n1 > 10) {
            n1 = sc.nextDouble();

            if (n1 < 0 || n1 > 10) {
                System.out.println("nota invalida");
            }
        }
        while (n2 < 0 || n2 > 10) {
            n2 = sc.nextDouble();

            if (n2 < 0 || n2 > 10) {
                System.out.println("nota invalida");
            }
        }

        double media = (n1 + n2)/2;
        System.out.printf("media = %.2f%n" , media);


        sc.close();
    }
}
