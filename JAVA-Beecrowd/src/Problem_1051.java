import java.util.Locale;
import java.util.Scanner;

public class Problem_1051 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if(salario <= 2000.00){
            System.out.println("Isento");
        } else if(salario <= 3000.00){
            double imposto = salario - 2000.00;
            imposto = imposto * 0.08;
            System.out.printf("R$ %.2f%n" , imposto);
        } else if(salario <= 4500.00){
            double imposto = salario - 3000.00;
            imposto = 1000 * 0.08 + imposto * 0.18;
            System.out.printf("R$ %.2f%n" , imposto);

        } else{
            double imposto = salario - 4500.00;
            imposto = 1000 * 0.08 + 1500 * 0.18 + imposto * 0.28;
            System.out.printf("R$ %.2f%n" , imposto);
        }


        sc.close();
    }
}
