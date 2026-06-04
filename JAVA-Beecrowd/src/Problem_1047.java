import java.util.Locale;
import java.util.Scanner;

public class Problem_1047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hinicio = sc.nextInt();
        int minicio = sc.nextInt();
        int hfinal = sc.nextInt();
        int mfinal = sc.nextInt();
        int inicio = hinicio * 60 + minicio;
        int fim = hfinal * 60 + mfinal;

        if(fim > inicio){
            int duracao = fim - inicio;
            int horas = duracao / 60;
            int minutos = duracao % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas , minutos);
        } else if(fim <= inicio){
            int duracao = (1440 - inicio) + fim;
            int horas = duracao / 60;
            int minutos = duracao % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas , minutos);
        }


        sc.close();
    }
}

