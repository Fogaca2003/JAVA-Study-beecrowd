public class Problem_1095 {
    public static void main(String[] args){
        int j = 60;
        int i = 1;

        while (j >= 0){
            System.out.printf("I=%d J=%d%n" , i , j);
            j-=5;
            i+=3;
        }
    }
}
