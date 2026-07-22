import java.util.Scanner;

public class Problem_1143 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt();


        for(int i = 1; i <= n; i++){
            System.out.printf("%d " ,i);
            System.out.printf("%.0f ", Math.pow(i , 2));
            System.out.printf("%.0f%n" , Math.pow(i, 3));
        }

        sc.close();
    }
}