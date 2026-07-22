import java.util.Scanner;

public class Problem_1142 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n*4; i++){
            if (i % 4 == 0){
                System.out.println("PUM");
            }else {
                System.out.printf("%d " , i);
            }
        }

        sc.close();
    }
}
