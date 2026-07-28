import java.util.Scanner;

public class Problem_1145 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= y; i++) {
            if (i % x == 0) {
                sb.append(i).append('\n');
            } else {
                sb.append(i).append(' ');
            }
        }

        System.out.print(sb);
        sc.close();
    }
}
