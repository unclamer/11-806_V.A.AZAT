import java.util.Scanner;

//  №1 Консольный калькулятор. Сначала вводится первое число, затем оператор (+, -, *, /), затем второе число.
//  Программа выводит результат и предлагает либо продолжить вычисления с имеющимся результатом
//  (т. е. на следующей итерации полученный результат будет считаться за первое число),
//  либо начать заново с введения оператора.

public class h5_calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float last = 0;
        boolean bool = false;

        while (true) {
            float a;
            if (!bool) {
                System.out.print("Первое число: ");
                a = sc.nextInt();
            } else {
                a = last;
            }

            System.out.print("Оператор: ");
            String operator = sc.next();

            System.out.print("Второе число: ");
            float b = sc.nextInt();

            float res = 0;
            if (operator.equals("*")) res = a * b;
            if (operator.equals("+")) res = a + b;
            if (operator.equals("/")) res = a / b;
            if (operator.equals("-")) res = a - b;

            System.out.println("Ответ: " + res);

            System.out.print("Сбросить результат: ");
            String reset = sc.next();
            if (reset.equals("n")) {
                last = res;
                bool = true;
            } else {
                bool = false;
                last = 0;
            }
        }
    }
}