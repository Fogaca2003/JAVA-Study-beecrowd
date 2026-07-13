import java.util.Scanner;

public class Problem_1132 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int menor, maior, total = 0;

        if (x < y){
            menor = x;
            maior = y;
        } else {
            menor = y;
            maior = x;
        }

        for (int i = menor; i <= maior; i++){
            if (i % 13 != 0){
                total += i;
            }
        }
        System.out.println(total);
        sc.close();
    }
}
