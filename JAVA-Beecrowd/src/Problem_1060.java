import java.util.Locale;
import java.util.Scanner;

public class Problem_1060 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int y = 0, pos = 0;


        while (y < 6){
            double x = sc.nextDouble();
            if (x > 0){
                pos += 1 ;
            }
            y += 1;
        }

        System.out.printf("%d valores positivos%n" , pos);

        sc.close();
    }
}
