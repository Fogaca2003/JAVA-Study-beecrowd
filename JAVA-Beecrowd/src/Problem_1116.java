import java.util.Scanner;

public class Problem_1116 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            double r;
            if (y == 0){
                System.out.println("divisao impossivel");
            } else{
                r = (double) x / y;
                System.out.println(r);
            }
        }

        sc.close();
    }
}
