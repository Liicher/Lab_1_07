package com.company.javabean;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class fileMaker {
    public fileMaker() {}

    public String newFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название файла.");
        System.out.println("Если такого файла нет, то создастся новый с таким именем");
        System.out.println("и Вам нужно будет заполнить его");
        System.out.print("Имя файла: ");
        String name = sc.nextLine();
        System.out.println();

        try {
            File file = new File(name + ".txt");
            if(!file.exists()) {
                file.createNewFile();
                Choice choice = new Choice();
                PrintWriter pw = new PrintWriter(file);
                pw.println(choice.choice(1));
                System.out.print("Введите объем данных: ");
                int amount;
                pw.println(amount = sc.nextInt());
                System.out.println("Введите данные, отделяя их 'Enter'");
                sc.nextLine();
                for (int i = 0; i < amount; i++) {
                    String str = sc.nextLine();
                    pw.println(str);
                }
                pw.close();
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e + "\nОшибка при создании файла!");
        }
        return name;
    }
}
