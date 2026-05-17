import java.util.Locale;
import java.util.Scanner;

public class Problem_1011 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159, volume;
        int R = sc.nextInt();

        volume = (4.0/3) * Math.pow(R,3) * pi;

        System.out.printf("VOLUME = %.3f%n" , volume);

        sc.close();

    }
}
