import java.util.Scanner;

public class Problem_1046 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int tempo;

        if (inicio >= fim){
            tempo = 24 - inicio + fim;
        } else {
            tempo = fim - inicio;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)%n" , tempo);


        sc.close();
    }
}
