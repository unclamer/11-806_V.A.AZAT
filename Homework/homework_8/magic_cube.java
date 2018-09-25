import java.util.Scanner;

public class magic_cube {
    public static void main(String[] agrgs){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean flag = true;
        int [] [] a = new int[n][n];
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int diagonalsum = 0;
        for (int i = 0;i < n;i++){
            diagonalsum += a[i][i];
        }
        int seconddiagonalsum = 0;
        for (int i =0; i < n;i++){
            seconddiagonalsum += a[i][n - 1 - i];
        }
        if (diagonalsum != seconddiagonalsum){
            flag = false;
        }
        for (int i = 0;i < n;i++){
            int sum = 0;
            for (int j = 0;j<n;j++){
                sum += a[i][j];
            }
            if (sum != diagonalsum){
                flag = false;
            }
        }
        for (int j = 0;j < n;j++){
            int secondsum = 0;
            for (int i = 0;i < n;i++){
                secondsum += a[i][j];
            }
            if (secondsum != seconddiagonalsum){
                flag = false;
            }

        }
        System.out.print(flag);
    }
}
