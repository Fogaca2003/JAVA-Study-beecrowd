import java.util.Scanner;

public class Problem_1131 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inter = sc.nextInt();
        int gremio = sc.nextInt();
        int Vinter = 0, Vgremio = 0, empate = 0, jogo = 1, partidas = 0;

        while (jogo == 1){
            partidas += 1;
            if (inter > gremio){
                Vinter += 1;
            }else if (gremio > inter){
                Vgremio += 1;
            }else {
                empate += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            jogo = sc.nextInt();
            if (jogo == 1){
            inter = sc.nextInt();
            gremio = sc.nextInt();
            }
        }

        System.out.println(partidas + " grenais");
        System.out.println("Inter:" + Vinter);
        System.out.println("Gremio:" + Vgremio);
        System.out.println("Empates:" + empate);

        if (Vinter > Vgremio){
            System.out.println("Inter venceu mais");
        }else if (Vgremio > Vinter){
            System.out.println("Gremio venceu mais");
        }else {
            System.out.println("Nao houve vencedor");
        }
        sc.close();
    }
}
