import java.util.Locale;
import java.util.Scanner;

public class Problem_1048 {

    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double salario = sc.nextDouble();
            double novo_salario;

            if(salario >= 0 && salario <= 400){
                novo_salario = (salario * 15) / 100;
                System.out.printf("Novo salario: %.2f%n" , novo_salario + salario);
                System.out.printf("Reajuste ganho: %.2f%n" , novo_salario);
                System.out.println("Em percentual: 15 %");
            } else if(salario > 400 && salario <= 800){
                novo_salario = (salario * 12) / 100;
                System.out.printf("Novo salario: %.2f%n" , novo_salario + salario);
                System.out.printf("Reajuste ganho: %.2f%n" , novo_salario);
                System.out.println("Em percentual: 12 %");
            } else if(salario > 800 && salario <= 1200){
                novo_salario = (salario * 10) / 100;
                System.out.printf("Novo salario: %.2f%n" , novo_salario + salario);
                System.out.printf("Reajuste ganho: %.2f%n" , novo_salario);
                System.out.println("Em percentual: 10 %");
            } else if(salario > 1200 && salario <= 2000){
                novo_salario = (salario * 7) / 100;
                System.out.printf("Novo salario: %.2f%n" , novo_salario + salario);
                System.out.printf("Reajuste ganho: %.2f%n" , novo_salario);
                System.out.println("Em percentual: 7 %");
            } else {
                novo_salario = (salario * 4) / 100;
                System.out.printf("Novo salario: %.2f%n" , novo_salario + salario);
                System.out.printf("Reajuste ganho: %.2f%n" , novo_salario);
                System.out.println("Em percentual: 4 %");
            }
            sc.close();
    }
}
