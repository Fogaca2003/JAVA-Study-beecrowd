import java.util.Scanner;

public class Problem_1175 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int[] n = new int[20];

        for(int i = 0; i < 20; i++){
            n[i] = sc.nextInt();
        }

        for (int i = 19; i >= 0; i--){
            System.out.printf("N[%d] = %d%n" , 19-i, n[i] );
        }

        sc.close();
    }
}
