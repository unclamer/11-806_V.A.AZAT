//Вариант 2

import java.util.Scanner;
public class ClassTestTask01 {
    public static void main(String[] args) {
       //задача 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int leng = n*n;
        int[] arr = new int[leng];
        for (int i = 0; i < leng; i++) {
            arr[i] = sc.nextInt();
        }
        sortArr(arr,leng);
        System.out.println();
        //задача 2
        int[][] matrix = new int[n][n];
        spiralFill(matrix,arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //задача 3
        System.out.println(underDiagonalSum(matrix));
    }



    static void sortArr(int[] arr, int leng) {
        int pr = 0;

        for (int j = 0; j < leng; j++) {
            for (int i = j+1; i < leng; i++) {
                int pr1 = arr[i];
                int pr2 = arr[j];

                int sum1=0;
                int sum2=0;

                while(pr1!=0)
                {
                    sum1 += pr1%10;
                    pr1 /= 10;
                }

                while(pr2!=0)
                {
                    sum2 += pr2%10;
                    pr2 /= 10;
                }

                if (sum1 < sum2) {
                    pr = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pr;
                }
            }
        }
        for(int i = 0;i<leng;i++){
            System.out.print(arr[i]+ " ");
        }
    }



    public static void spiralFill(int[][] matrix, int[] arr) {
        int n = matrix.length;
        int index = 0;
        int ring = (n / 2 == 0) ? n / 2 : n / 2 + 1;
        for (int r = 0; r < ring; r++) {
            for (int i = r; i < n - r; i++) {
                matrix[r][i] = arr[index];
                index++;
            }

            for (int i = r + 1; i < n - r; i++) {
                matrix[i][n - r - 1] = arr[index];
                index++;
            }

            for (int i = n - r - 2; i > r; i--) {
                matrix[n - r - 1][i] = arr[index];
                index++;
            }

            for (int i = n - r - 1; i > r; i--) {
                matrix[i][r] = arr[index];
                index++;
            }
        }
    }



    public static int underDiagonalSum(int matrix[][]) {
        int n = matrix.length;
        int udiagonalsum = 0;
        for (int i = 0;i < n;i++){
            for (int j = i+1;j<n;j++){
                udiagonalsum += matrix[i][j];
            }
        }
        return udiagonalsum;
    }
}
