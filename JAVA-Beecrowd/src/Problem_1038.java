import java.util.Locale;
import java.util.Scanner;

public class Problem_1038 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = 0 ;

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();


        switch (codigo){
            case 1:
                valor = 4.0;
                break;
            case 2:
                valor = 4.5;
                break;
            case 3:
                valor = 5.0;
                break;
            case 4:
                valor = 2.0;
                break;
            case 5:
                valor = 1.5;
                break;
        }

        System.out.printf("Total: R$ %.2f%n" , valor * quantidade);

        sc.close();
    }

}
