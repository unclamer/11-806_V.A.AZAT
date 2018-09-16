import java.util.Scanner;

public class h3_local_min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), local_min=0;
        int[] chisla = new int[n];
        for (int i = 0; i < n; i++){
            chisla[i] = in.nextInt();
        }
        for (int i = 2; i < n; i++){
            if(chisla[i-1]<chisla[i-2] && chisla[i-1]<chisla[i])
                local_min = chisla[i-1];
        }
        System.out.println(local_min);

    }
}