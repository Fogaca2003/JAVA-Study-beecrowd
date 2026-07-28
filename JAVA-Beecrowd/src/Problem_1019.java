import java.util.Scanner;

public class Problem_1019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int hora = n / 3600;
        int resto = n % 3600;

        int minuto = resto / 60;
        int segundo = resto % 60;

        System.out.println(hora + ":" + minuto + ":" + segundo );


        sc.close();
    }
}
