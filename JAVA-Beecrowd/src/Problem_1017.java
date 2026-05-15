import java.util.Locale;
import java.util.Scanner;

public class Problem_1017 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int hours, v, kmL = 12;
        double distancia;

        hours = sc.nextInt();
        v = sc.nextInt();

        distancia = (double) v * hours;
        System.out.printf("%.3f%n" , distancia / kmL);


        sc.close();
    }
}
