import java.util.Scanner;

public class Problem_1134 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int i = sc.nextInt();

        while (i != 4){
            if (i == 1){
                alcool += 1;
            }
            if (i == 2){
                gasolina += 1;
            }
            if (i == 3){
                diesel += 1;
            }
            i = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d%n" , alcool);
        System.out.printf("Gasolina: %d%n" , gasolina);
        System.out.printf("Diesel: %d%n" , diesel);

        sc.close();
    }
}
