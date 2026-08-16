import java.util.Scanner;

public class Problem_1172 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int[] vet = new int[10];


            for (int i = 0; i < 10; i++){
                vet[i] = sc.nextInt();
                if (vet[i] == 0 || vet[i] < 0){
                    vet[i] = 1;
                }
            }
            for (int i = 0; i < 10; i++){
                System.out.printf("X[%d] = %d%n" , i , vet[i]);
            }
        }
    }

