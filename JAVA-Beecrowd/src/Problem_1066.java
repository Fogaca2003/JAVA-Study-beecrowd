import java.util.Scanner;

public class Problem_1066 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int pares = 0, impar = 0, positivo = 0, negativo = 0;

        for (int i = 0; i < 5; i++ ){
            int n = sc.nextInt();
            if (n % 2 == 0){
                pares++;
            }else{
                impar++;
            }

            if (n > 0){
                positivo++;
            }else if (n < 0){
                negativo++;
            }
        }
        System.out.printf("%d valor(es) par(es)%n", pares);
        System.out.printf("%d valor(es) impar(es)%n", impar);
        System.out.printf("%d valor(es) positivo(s)%n", positivo);
        System.out.printf("%d valor(es) negativo(s)%n", negativo);



        sc.close();
    }
}
