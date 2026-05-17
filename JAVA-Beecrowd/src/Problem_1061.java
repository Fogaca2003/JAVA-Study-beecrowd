import java.util.Scanner;

public class Problem_1061 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int diaInicial, horaInicial, minutoInicial, segundoInicial;
        int diaFinal, horaFinal, minutoFInal, segundoFinal;

        // Leitura do início
        sc.next(); // lê a palavra "Dia"
        diaInicial = sc.nextInt();

        horaInicial = sc.nextInt();
        sc.next(); // lê ":"
        minutoInicial = sc.nextInt();
        sc.next(); // lê ":"
        segundoInicial = sc.nextInt();

        // Leitura do fim
        sc.next(); // lê a palavra "Dia"
        diaFinal = sc.nextInt();

        horaFinal = sc.nextInt();
        sc.next(); // lê ":"
        minutoFInal = sc.nextInt();
        sc.next(); // lê ":"
        segundoFinal = sc.nextInt();


        int inicio_total = diaInicial * 86400 + horaInicial * 3600 + minutoInicial * 60 + segundoInicial;
        int final_total = diaFinal * 86400 + horaFinal * 3600 + minutoFInal * 60 + segundoFinal;
        int duracao = final_total - inicio_total;

        int dias = duracao / 86400;
        duracao = duracao % 86400;

        int horas = duracao / 3600;
        duracao = duracao % 3600;

        int minutos = duracao / 60;
        duracao = duracao % 60;

        int segundos = duracao;

        System.out.printf("%d dia(s)%n" , dias);
        System.out.printf("%d hora(s)%n" , horas);
        System.out.printf("%d minuto(s)%n" , minutos);
        System.out.printf("%d segundo(s)%n" , segundos);


        sc.close();
    }
}
