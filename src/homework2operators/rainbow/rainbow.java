package homework2operators.rainbow;

import java.util.Scanner;

public class rainbow {


/* Как рационально в этом ТЗ использовать константы не придумал :(

   public final int RED = 1;
    public final int ORANGE = 2;
    public final int YELLOW = 3;
    public final int GREEN = 4;
    public final int BLUE = 5;
    */

    public static void chain() {

        System.out.println("Выберете каким способом произвести выбор цвета: ");
        System.out.println("1 - Оператором if - else ");
        System.out.println("2 - Оператором swich - case ");
        System.out.println("3 - Создать полуцвет ");
        System.out.print("Ввод номера способа: ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        switch (number) {
            case 1:
                if_else();
                break;
            case 2:
                swich_case();
                break;
            case 3:
                combi();
                break;
            default:
                System.out.println("Введенное число не соответствует заданному условию! ");
                break;
        }
    }


    public static String  if_else() {

        System.out.println("Введите число от 1 до 5 ");
        System.out.print("для выбора цвета:  ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number == 1) {
            System.out.println("Введенное число соответствует цвету Красный ");
            return "Красно-";
        } else if (number == 2) {
            System.out.println("Введенное число соответствует цвету Оранжевый ");
            return "Оранжево-";
        } else if (number == 3) {
            System.out.println("Введенное число соответствует цвету Желтый ");
            return "Желто-";
        } else if (number == 4) {
            System.out.println("Введенное число соответствует цвету Зеленый ");
            return "Зелено-";
        } else if (number == 5) {
            System.out.println("Введенное число соответствует цвету Синий ");
            return "Сине-";
        } else
            System.out.println("Введенное число вне требуемого диапозона! ");
        return null;
    }


    public static String swich_case() {

        System.out.println("Введите число от 1 до 5 ");
        System.out.print("для выбора цвета:  ");

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        switch (number) {
            case 1:
                number = 1;
            System.out.println("Введенное число соответствует цвету Красный ");
            return "красный";
            case 2:
                number = 2;
            System.out.println("Введенное число соответствует цвету Оранжевый ");
                return "оранжевый";
            case 3:
                number = 3;
            System.out.println("Введенное число соответствует цвету Желтый ");
                return "желтый";
            case 4:
                 number = 4;
            System.out.println("Введенное число соответствует цвету Зеленый ");
                return "зеленый";
            case 5:
                number = 5;
            System.out.println("Введенное число соответствует цвету Синий ");
                return "синий";
            default:
                System.out.println("Введенное число вне требуемого диапозона! ");
                break;
        }
        return null;
    }

    public static void combi() {

        String color1 = if_else();
        String color2 = swich_case();
        String plus = color1.concat(color2);
        System.out.println("Полученный результат:");
        System.out.println(plus);
    }

}









