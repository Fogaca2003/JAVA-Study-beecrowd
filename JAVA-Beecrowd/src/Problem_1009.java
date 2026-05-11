import java.util.Locale;
import java.util.Scanner;

public class Problem_1009 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        double commission, value, salary, sales;

        name = sc.next();
        value = sc.nextDouble();
        sales = sc.nextDouble();

        salary = value + (sales * 15) / 100;

        System.out.printf("TOTAL = R$ %.2f%n" , salary);

        sc.close();
    }
}
