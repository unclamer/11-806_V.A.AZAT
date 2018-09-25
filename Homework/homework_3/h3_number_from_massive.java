import java.util.Scanner;

public class h3_number_from_massive{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String poloj_str ="";
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
            poloj_str += numbers[i];
        }
        int x = Integer.parseInt(poloj_str);
        System.out.println(x);
    }
}
