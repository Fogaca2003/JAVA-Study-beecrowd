import java.util.Locale;
import java.util.Scanner;

public class Problem_1021 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        // Converte para centavos para evitar erros de precisão com double
        int restante = (int) Math.round(valor * 100);

        int nota100 = restante / 10000;
        restante %= 10000;

        int nota50 = restante / 5000;
        restante %= 5000;

        int nota20 = restante / 2000;
        restante %= 2000;

        int nota10 = restante / 1000;
        restante %= 1000;

        int nota5 = restante / 500;
        restante %= 500;

        int nota2 = restante / 200;
        restante %= 200;

        int moeda1 = restante / 100;
        restante %= 100;

        int moeda50 = restante / 50;
        restante %= 50;

        int moeda25 = restante / 25;
        restante %= 25;

        int moeda10 = restante / 10;
        restante %= 10;

        int moeda5 = restante / 5;
        restante %= 5;

        int moeda01 = restante;

        System.out.println("NOTAS:");
        System.out.println(nota100 + " nota(s) de R$ 100.00");
        System.out.println(nota50 + " nota(s) de R$ 50.00");
        System.out.println(nota20 + " nota(s) de R$ 20.00");
        System.out.println(nota10 + " nota(s) de R$ 10.00");
        System.out.println(nota5 + " nota(s) de R$ 5.00");
        System.out.println(nota2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
