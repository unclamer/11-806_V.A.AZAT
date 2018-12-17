import java.util.Scanner;
import java.util.regex.Pattern;

//  №2 Пользователь вводит строку. Заменить в строке все цифры на символ *.
//  Полученную строку вывести на экран. (“a1 2b6” → Ответ: “a* *b*”)

public class h5_replace_of_numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        String result = "";


//        for (int i = 0; i < str.length(); i++) {
//            result += (Pattern.matches("\\d", String.valueOf(chars[i]))) ? "*" : chars[i];
//        }

        // или

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] >= 48 && (int) chars[i] <= 57) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((int) chars[i] - '0' == numbers[j]) {
                        result += "*";
                    }
                }
            } else {
                result += chars[i];
            }
        }

        System.out.println(result);
    }
}
