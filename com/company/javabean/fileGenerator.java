package com.company.javabean;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;

public class fileGenerator implements IGenerator {
    private static int type;
    private static int len;
    private static int[] ArrayInt;
    private static String[] ArrayStr;

    @Override
    public void generate() {
        fileMaker fM = new fileMaker();
        BufferedReader br = null;

        String name;                            // name of the file
        name = fM.newFile();

        File file = new File(name + ".txt");
        if(!file.exists()) {
            System.out.println("ERROR! Ошибка открытия файла! - fileGenerator - 25");
        }

        try {
            Scanner fsc = new Scanner(new File(name + ".txt"));
            type = fsc.nextInt();
            if (type == 1) {
                ArrayInt = new int[len = fsc.nextInt()];
                for(int i = 0; i < ArrayInt.length; i++) {
                    ArrayInt[i] = fsc.nextInt();
                }
            } else {
                ArrayStr = new String[len = fsc.nextInt()];
                fsc.nextLine();
                for (int i = 0; i < ArrayStr.length; i++) {
                    ArrayStr[i] = fsc.nextLine();
                }
            }
        } catch (IOException e) {
            System.out.println("ERROR! " + e + " \nОшибка чтения из файла!");
        }
    }

    public int[] getArrayInt() { return ArrayInt; }
    public String[] getArrayStr() {return ArrayStr;}
    public int getType() { return type; }
    public int getLen() { return len; }
}
