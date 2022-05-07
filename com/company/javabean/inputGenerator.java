package com.company.javabean;

import java.util.Scanner;

public class inputGenerator implements IGenerator {
    private static int type;
    private static int len;
    private static int[] ArrayInt;
    private static String[] ArrayStr;

    @Override
    public void generate() {
        Scanner sc = new Scanner(System.in);
        Choice choice = new Choice();

        type = choice.choice(1);

        System.out.print("Введите объем данных: ");
        len = sc.nextInt();

        if (type == 1) {
            ArrayInt = new int[len];
            for(int i = 0; i < ArrayInt.length; i++) {
                ArrayInt[i] = sc.nextInt();
            }
        } else {
            ArrayStr = new String[len];
            sc.nextLine();
            for (int i = 0; i < ArrayStr.length; i++) {
                ArrayStr[i] = sc.nextLine();
            }
        }
    }

    public int getType() { return type; }
    public int getLen() { return len; }
    public int[] getArrayInt() { return ArrayInt; }
    public String[] getArrayStr() { return ArrayStr; }
}
