import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_1146 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0)
                break;

            for (int i = 1; i < x; i++) {
                sb.append(i).append(" ");
            }

            sb.append(x).append('\n');
        }

        System.out.print(sb);
        }
    }