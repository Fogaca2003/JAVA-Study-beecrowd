import java.util.Scanner;

public class Problem_1154 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        double soma = 0;
        int i = 0;
        double media;

        while (idade > 0){
            i += 1;
            soma += idade;
            idade = sc.nextInt();
        }
        media = soma / i;
        System.out.printf("%.2f%n" , media);

        sc.close();
    }
}
