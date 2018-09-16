import java.util.Scanner;

public class h3_turn_around {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), local_min = 0;
        int[] chisla = new int[n];
        for (int i = 0; i < n; i++) {
            chisla[i] = in.nextInt();
        }
        for (int i = n-1  ; i >= 0;i--){
            System.out.print(chisla[i] + " ");
        }
    }
}