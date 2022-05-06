package com.company.javabean;

import java.util.Random;

public class randGenerator implements IGenerator {
    private static final int N = 5;                             // Размер объема данных (изменяется здесь)
    private static final int[] Array_int = new int[N];          // Массив для целлочисленных данных
    private static final String[] Array_Str = new String[N];    // Массив для строк

    @Override
    public void generate() {
        Choice choice = new Choice();
        switch (choice.choice(1)) {
            // Генерация целочисленных данных
            case 1:
                for(int i = 0; i < N; i++) {
                    Array_int[i] = 1 + (int) ( Math.random() * 100 );
                    System.out.print(Array_int[i] + " ");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {}
                }
                System.out.println();
                break;

            // Генерация строк
            case 2:
                String str="abcdefghijklmnopqrstuvwxyz";
                for(int j = 0; j < N; j++) {
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
                    Array_Str[j] = sb.toString();
                }

                // Вывод массива строк
                for(int i = 0; i<N; i++) {
                    System.out.println(Array_Str[i]);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {}
                }
                System.out.println();
                break;

            default:
                break;
        }
    }
}
