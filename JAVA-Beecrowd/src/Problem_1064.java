import java.util.Locale;
import java.util.Scanner;

public class Problem_1064 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorT = 0;
        int positivos = 0;

        for (int i = 0; i < 6; i++){
            double valor = sc.nextDouble();

            if (valor > 0){
                positivos++;
                valorT += valor;
            }
        }

        System.out.printf("%d valores positivos%n", positivos);
        System.out.printf("%.1f%n" , (valorT / positivos));

        sc.close();
    }
}
