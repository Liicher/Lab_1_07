package com.company.javabean;
import java.util.Scanner;

public class Choice
{
    public Choice() { }

    public int choice(int CKey)
    {
        Scanner sc = new Scanner(System.in);
        int key;
        switch (CKey)
        {
            case 1:
                System.out.println("Генератор целых чисел или строк:\n");
                System.out.println("1. Генератор целых чисел");
                System.out.println("2. Генератор строк");
                System.out.print("Введите нужное действие: ");
                key = sc.nextInt();
                System.out.println();
                return key;

            case 2:
                System.out.println("Какие значения удалить?");
                System.out.println("1 - Нечетные");
                System.out.println("2 - Четные");
                System.out.print("Введите нужное действие: ");
                key = sc.nextInt();
                System.out.println();
                return key;

            case 3:
                System.out.println("Какие данные взять?");
                System.out.println("1 - Из файла");
                System.out.println("2 - Ввести данные в ручную");
                System.out.println("3 - Случайные данные");
                System.out.print("Введите нужное действие: ");
                key = sc.nextInt();
                System.out.println();
                return key;

            case 4:
                System.out.println("Желаете создать новый файл?");
                System.out.println("1 - Да");
                System.out.println("2 - Нет");
                System.out.println("Введите нужное действие: ");
                key = sc.nextInt();
                System.out.println();
                return key;

            default:
                return 0;
        }
    }
}
