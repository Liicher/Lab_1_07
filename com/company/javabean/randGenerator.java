package com.company.javabean;

import java.util.Random;
import java.util.Scanner;

public class randGenerator implements IGenerator, Runnable {
    private static int len;                            // Размер объема данных (изменяется здесь)
    private static int[] ArrayInt;                     // Массив для целлочисленных данных
    private static String[] ArrayStr;                  // Массив для строк
    private static int type;

    @Override
    public void generate() {
        Choice choice = new Choice();
        Scanner sc = new Scanner(System.in);

        type = choice.choice(1);
        System.out.print("Введите объем данных: ");
        len = sc.nextInt();

        switch (type) {
            // Генерация целочисленных данных
            case 1:
                ArrayInt = new int[len];
                for(int i = 0; i < len; i++) {
                    ArrayInt[i] = 1 + (int) ( Math.random() * 100 );
                    System.out.print(ArrayInt[i] + " ");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {}
                }
                System.out.println("\n");
                break;

            // Генерация строк
            case 2:
                ArrayStr = new String[len];
                String str="abcdefghijklmnopqrstuvwxyz";
                for(int j = 0; j < len; j++) {
                    Random random = new Random();
                    StringBuilder sb = new StringBuilder();

                    // Генерация случайной длины строки
                    int Rand = 5 + (int) (Math.random()*100);
                    int len = 5 + (int) (Math.random() * Rand);
                    boolean flag = false;

                    // Генерация самой строки
                    for (int i = 0; i < len; i++) {
                        int number=random.nextInt(30);

                        // Проверка на двойной пробел
                        while(!flag) {
                            number=random.nextInt(30);
                            if(number < 26) {
                                flag = true;
                            }
                        }

                        // Если пробел
                        if(number >= 26) {
                            flag = false;
                            sb.append(" ");
                        }
                        else // Какой-то символ
                        {
                            sb.append(str.charAt(number));
                        }
                    }
                    ArrayStr[j] = sb.toString();
                }

                // Вывод массива строк
                for(int i = 0; i < len; i++) {
                    System.out.println(ArrayStr[i]);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ignored) {}
                }
                System.out.println();
                break;

            default:
                break;
        }
    }

    @Override
    public void run() { generate(); }

    public int getLen() { return len; }
    public int[] getArrayInt() { return ArrayInt; }
    public String[] getArrayStr() { return ArrayStr; }
    public int getType() { return type; }
}
