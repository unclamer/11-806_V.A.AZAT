import java.util.Scanner;

public class max_sum_of_lane_and_column {
    public static void main(String[] agrgs) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int maxlinesum = 0;
        int maxcolumnesum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0;i < n;i++){
            int sum = 0;
            for (int j = 0;j<n;j++){
                sum += a[i][j];
            }
            if (sum > maxcolumnesum){
                maxcolumnesum = sum;
            }
        }
        for (int j = 0;j < n;j++){
            int sum = 0;
            for (int i = 0;i < n;i++){
                sum += a[i][j];
            }
            if (sum > maxlinesum){
                maxlinesum = sum;
            }
        }
        System.out.print(maxlinesum + " " +maxcolumnesum);
    }
}
