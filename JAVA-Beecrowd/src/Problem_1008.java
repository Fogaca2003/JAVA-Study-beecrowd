import java.util.Locale;
import java.util.Scanner;

public class Problem_1008 {
    public  static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int number, hours;
        double value, salary;

        number = sc.nextInt();
        hours = sc.nextInt();
        value = sc.nextDouble();

        salary = (double) hours * value;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n" , salary);

        sc.close();
    }
}
