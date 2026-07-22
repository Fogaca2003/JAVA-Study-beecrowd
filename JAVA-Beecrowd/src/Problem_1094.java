import java.util.Scanner;

public class Problem_1094 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int qt, C, S, R;
        int Ctotal = 0, Stotal = 0, Rtotal = 0, qtotal = 0;
        char animal;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            qt = sc.nextInt();
            animal = sc.next().charAt(0);
            if (animal == 'C'){
                C = qt;
                Ctotal += C;
            }else if (animal == 'S'){
                S = qt;
                Stotal += S;
            } else if (animal == 'R'){
                R = qt;
                Rtotal += R;
            }

            qtotal += qt;
        }
        System.out.printf("Total: %d cobaias%n" , qtotal);
        System.out.printf("Total de coelhos: %d%n" , Ctotal);
        System.out.printf("Total de ratos: %d%n" , Rtotal);
        System.out.printf("Total de sapos: %d%n" , Stotal);

        double percent_coelho, percent_rato, percent_sapo;

        percent_coelho =(double) (100 * Ctotal) / qtotal;
        percent_rato =(double) (100 * Rtotal) / qtotal;
        percent_sapo =(double) (100 * Stotal) / qtotal;

        System.out.printf("Percentual de coelhos: %.2f %%%n" , percent_coelho);
        System.out.printf("Percentual de ratos: %.2f %%%n" , percent_rato);
        System.out.printf("Percentual de sapos: %.2f %%%n" , percent_sapo);


        sc.close();
    }
}
