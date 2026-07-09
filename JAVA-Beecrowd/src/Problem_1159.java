import java.util.Scanner;

public class Problem_1159 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = 0;
        int soma = 0;

        while (x != 0){
            while (y < 5){
                if (x % 2 == 0){
                    soma += x;
                    y++;
                }
                x++;
            }

            System.out.println(soma);
            y = 0;
            soma = 0;
            x = sc.nextInt();
        }


        sc.close();
    }
}
