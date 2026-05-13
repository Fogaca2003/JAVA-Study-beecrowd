import java.util.Locale;
import java.util.Scanner;

public class Problem_1010 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, code2, amount1, amount2;
        double value1, value2, tvalue;

        code1 = sc.nextInt();
        amount1 = sc.nextInt();
        value1 = sc.nextDouble();

        code2 = sc.nextInt();
        amount2 = sc.nextInt();
        value2 = sc.nextDouble();

        tvalue = (double) amount1 * value1 + (double) amount2 * value2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n" , tvalue);

        sc.close();
    }
}
