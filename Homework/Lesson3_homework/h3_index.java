import java.util.Scanner;

public class h3_index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), index = 0, maxch = -1;
        int[] chisla = new int[n];
        for (int i = 0; i < n; i++){
            chisla[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++){
            if(maxch < chisla[i]) {
                maxch = chisla[i];
                index = i;
            }
        }
        System.out.println(index);

    }
}
