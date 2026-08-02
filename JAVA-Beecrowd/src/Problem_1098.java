import java.util.Locale;

public class Problem_1098 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        double contador = 0;
        double j = 1;

        while (contador <= 2){

            if (contador == (int) contador) {
                System.out.printf("I=%d ", (int) contador);
                System.out.printf("J=%d%n" ,(int) j);
                System.out.printf("I=%d ", (int) contador);
                System.out.printf("J=%d%n" , (int) j+1);
                System.out.printf("I=%d ", (int) contador);
                System.out.printf("J=%d%n" , (int) j+2);

            } else {
                System.out.printf("I=%.1f ", contador);
                System.out.printf("J=%.1f%n" , j);
                System.out.printf("I=%.1f ", contador);
                System.out.printf("J=%.1f%n" , j+1);
                System.out.printf("I=%.1f ", contador);
                System.out.printf("J=%.1f%n" , j+2);
            }

            contador += 0.2;
            j += 0.2;
            contador = Math.round(contador * 10) / 10.0;
            j = Math.round(j * 10) / 10.0;
        }
    }
}
