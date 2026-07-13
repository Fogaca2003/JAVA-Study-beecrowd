import java.util.Scanner;

public class Problem_1153 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 1;

        for (int i = n; i > 0; i--){
            total = total * i;
        }

        System.out.println(total);
        sc.close();
    }
}
