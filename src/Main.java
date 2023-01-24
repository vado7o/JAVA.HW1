import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }

    static void task1() {
    int num;
    int sum = 0;
        while (true) {
            System.out.println("Введите целое число: ");
            Scanner scanner = new Scanner(System.in);
            try {
                num = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели неправильный формат числа!!!");
            }
        }
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + num + " равна " + sum);
    }

    static void task2() {
        int num;
        int sum = 1;
        while (true) {
            System.out.println("Введите целое число: ");
            Scanner scanner = new Scanner(System.in);
            try {
                num = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Вы ввели неправильный формат числа!!!");
            }
        }
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println("Произведение чисел от 1 до " + num + " равна " + sum);
    }

    static void task3() {
        boolean check;
        for (int i = 2; i <= 1000; i++) {
            check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) check = false;
            }
            if (check) System.out.print(i + ", ");
        }
    }

    static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствуем Вас в калькуляторе!");
        int num1 = getNums("ПЕРВОЕ");
        int num2 = getNums("ВТОРОЕ");
        String op = "";
        String[] ops = new String[]{"+", "-", "/", "*"};
        List list = Arrays.asList(ops);

        while (!list.contains(op)) {
            System.out.println("Введите пожалуйста ПРАВИЛЬНЫЙ оператор действия (+, -, /, *): ");
            op = scanner.nextLine();
        }
        System.out.println(num1 + " " + op + " " + num2 + " = " + operate(num1, num2, op));
    }

    static int getNums(String var) {
        while (true) {
            System.out.println("Введите " + var + " целое число: ");
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ввели неправильный формат числа!!!");
            }
        }
    }

    static int operate(int num1, int num2, String op) {
        if (Objects.equals(op, "+")) return num1 + num2;
        else if (Objects.equals(op, "-")) return num1 - num2;
        else if (Objects.equals(op, "/")) return num1 / num2;
        else return num1 * num2;
    }

    static void task5() {
        System.out.println("Будем вводить уровнение вида: A? + ?B = C");
        int num1 = getValues("A");
        int num2 = getValues("B");
        int num3 = getValues("C");
        boolean check = false;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (Integer.parseInt(Integer.toString(num1) + i) + Integer.parseInt(Integer.toString(j) + num2) == num3) {
                    System.out.println("Решением Вашего уравнения является вариант вида: " + num1 + i + " + " + j + num2 + " = " + num3);
                    check = true;
                }
            }
        }
        if (!check) System.out.println("Для Вашего уравнения решения не найдено!!!");
    }

    static int getValues(String var) {
        while (true) {
            System.out.println("Введите целое число для позиции " + var);
            Scanner scanner = new Scanner(System.in);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ввели неправильный формат числа!!!");
            }
        }
    }
}