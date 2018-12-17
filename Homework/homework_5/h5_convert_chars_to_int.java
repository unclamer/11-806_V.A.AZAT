import java.util.Scanner;

//  №3 Пользователь вводит число, считать его в строковую переменную.
//  Затем из строки получить числовое значение и записать в переменную типа int.
//  Выполнить получение числа с помощью прохода в цикле по массиву char’ов, полученному из строки.

public class h5_convert_chars_to_int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char[] chars = number.toCharArray();
        int result = 0;

        for (int i = 0; i < chars.length; i++) {
            result += Math.pow(10, chars.length - i - 1) * (chars[i] - '0');
        }

        System.out.println(result);
    }
}
