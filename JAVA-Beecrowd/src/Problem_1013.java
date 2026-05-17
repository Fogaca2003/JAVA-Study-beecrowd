import java.util.Scanner;

public class Problem_1013 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a,b,c, maiorAB, maiorT;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        maiorAB = ((a + b) + Math.abs(a - b)) / 2 ;
        maiorT = ((maiorAB + c) + Math.abs(maiorAB - c)) / 2;

        System.out.printf("%d eh o maior%n" , maiorT);


        sc.close();
    }
}
