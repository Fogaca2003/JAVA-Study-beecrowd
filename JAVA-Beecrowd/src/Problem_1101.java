import java.util.Scanner;

public class Problem_1101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int maior, menor;

        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m > 0 && n > 0) {

            int total = 0;

            if (m > n) {
                maior = m;
                menor = n;
            } else {
                maior = n;
                menor = m;
            }

            for (int i = menor; i <= maior; i++){
                System.out.printf("%d ", i);
                total += i;
            }
            System.out.printf("Sum=%d%n" , total);
            m = sc.nextInt();
            n = sc.nextInt();
        }

        sc.close();
    }
}
