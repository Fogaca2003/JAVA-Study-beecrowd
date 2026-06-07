import java.util.Locale;
import java.util.Scanner;

public class Problem_1042 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int a = n1;
        int b = n2;
        int c = n3;
        int aux;

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        sc.close();

    }
}
