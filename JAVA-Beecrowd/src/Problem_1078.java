import java.util.Scanner;

public class Problem_1078 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n > 2 && n < 1000){
            for (int i = 1; i <= 10; i++){
                System.out.printf(i + " x " + n + " = " + n*i + "%n");
            }
        }

        sc.close();
    }
}
