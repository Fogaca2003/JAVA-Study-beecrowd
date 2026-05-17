import java.util.Locale;
import java.util.Scanner;

public class Problem_1018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int restante = valor;

        int nota100 = restante / 100;
        restante = restante % 100;

        int nota50 = restante / 50;
        restante = restante % 50;

        int nota20 = restante / 20;
        restante = restante % 20;

        int nota10 = restante / 10;
        restante = restante % 10;

        int nota5 = restante / 5;
        restante = restante % 5;

        int nota2 = restante / 2;
        restante = restante % 2;

        int nota1 = restante;

        System.out.println(valor);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
        sc.close();
    }
}
