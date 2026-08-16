import java.util.Scanner;

public class Problem_1173 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] v = new int[10];
        int n = sc.nextInt();

        v[0] = n;

        System.out.printf("N[0] = %d%n", v[0]);
        for (int i = 1; i < 10; i++){
            v[i] = v[i-1] * 2;
            System.out.printf("N[%d] = %d%n", i, v[i]);
        }


        sc.close();
    }
}
