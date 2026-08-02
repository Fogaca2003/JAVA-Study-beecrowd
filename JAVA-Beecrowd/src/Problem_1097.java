public class Problem_1097 {
    public static void main(String[] args){
        int i = 1;
        int j = 7;

        while (i <= 9){
            for (int n  = 0 ; n < 3; n++){
                System.out.printf("I=%d J=%d%n" , i , j);
                j--;
            }
            j+=5;
            i+=2;
        }
    }
}
