import java.util.Scanner;

public class Problem_1020 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int restante = valor;

        int ano = restante / 365;
        restante = restante % 365;

        int mes = restante / 30;
        restante = restante % 30;

        int dia = restante;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();

    }
}
