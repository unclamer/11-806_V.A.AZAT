import java.util.Scanner;

//  №4 Программа предлагает пользователю ввести строку.
//  Затем программа запрашивает символ-ключ: u или l,
//  где u означает, что буквы в строке надо привести к верхнему регистру (upper case),
//  l означает - к нижнему регистру (lower case).

public class h5_upper_or_lower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.next();

        System.out.print("Введите ключ: ");
        String key = sc.next();

        char[] chars = str.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i++) {
            if (key.equals("l")) {
                result += ((int) chars[i] >= 97) ? (char) (chars[i] - 32) : chars[i];
            } else if (key.equals("u")) {
                result += ((int) chars[i] >= 65 && (int) chars[i] <= 90) ? (char) (chars[i] + 32) : chars[i];
            }
        }

        System.out.println(result);
    }
}
