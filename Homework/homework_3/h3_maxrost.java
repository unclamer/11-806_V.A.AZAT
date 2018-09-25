import java.util.Scanner;

public class h3_maxrost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxrost = 0;
        int[] rost = new int[n];
        for (int i = 0; i < n; i++) {
            rost[i] = in.nextInt();
            if (maxrost < rost[i]) {
                maxrost = rost[i];
            }
        }
        System.out.println(maxrost);
    }
}
