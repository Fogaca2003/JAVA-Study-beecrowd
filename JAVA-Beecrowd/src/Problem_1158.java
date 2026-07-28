import java.util.Scanner;

public class Problem_1158 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
            int total = 0;
            int cont = 0;

            while (cont < x){
                if (y % 2 != 0) {
                    total += y;
                    cont++;
                }
                y++;
            }
            System.out.println(total);
        }
        sc.close();
    }
}
