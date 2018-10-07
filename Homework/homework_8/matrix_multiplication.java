import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt(); int n2 = in.nextInt();
        int [][] fm = new int[n1][n2];
        for (int i = 0;i < n1; i++){
            for (int j = 0;j< n2;j++){
                fm[i][j]= in.nextInt();
            }
        }
        int m1 = in.nextInt(); int m2 = in.nextInt();
        int [][] sm = new int[m1][m2];
        for (int i = 0;i < m1; i++){
            for (int j = 0;j< m2;j++){
                sm[i][j]= in.nextInt();
            }
        }
        int [][] rm = new int[m1][n2];
        multiplication(fm,n1,n2,m1,m2,sm,rm);
        if (n1 != m2){
            System.out.print("Action not possible, enter new data");
        }
    }

    static void multiplication(int[][] fm,int n1,int n2,int m1,int m2,int[][] sm,int[][] rm){
        int sum,ct = 0;
        for(int k = 0;k<n1;k++) {
            for (int i = 0; i < n1; i++) {
                sum = 0;
                for (int j = 0; j < n2; j++) {
                    sum += fm[ct][j] * sm[j][i];
                }
                rm[ct][i] = sum;
            }
            ct++;
        }
        printArr(rm,n1,m2);
    }
    static void printArr(int[][] rm,int n1,int m2)
    {
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(rm[i][j] + " ");
            }
            System.out.println();
        }
    }
}
