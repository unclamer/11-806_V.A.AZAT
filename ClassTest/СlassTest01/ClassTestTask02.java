import java.util.Scanner;

public class ClassTestTask02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineS = sc.nextLine();

        System.out.println(palindrom(lineS));

    }

    static boolean palindrom(String lineIn){
        char[] lineC = lineIn.toCharArray();
        int ln = lineIn.length();

        if (ln<=1) return true;

        String lineOut = "";

        for (int i = 1; i < 1-ln ; i++) {
            lineOut+= lineC[i];
        }

        if (lineC[0]==lineC[ln-1]){
            return palindrom(lineOut);
        } else {
            return false;
        }
    }

}