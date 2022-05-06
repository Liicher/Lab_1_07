package com.company.javabean;

public class Process {

    public Process()
    {

    }

    public void process()
    {
        // Запуск обоих оброботчиков того или иного типа данных
        if (Generate.getArrKey() == 1) {

            ProcessInt_1 P1 = new ProcessInt_1();
            ProcessInt_2 P2 = new ProcessInt_2();

            Thread thread_P1 = new Thread(P1);
            Thread thread_P2 = new Thread(P2);

            thread_P1.start();
            thread_P2.start();
        }
        else {
            ProcessString_1 P1 = new ProcessString_1();
            ProcessString_2 P2 = new ProcessString_2();

            Thread thread_P1 = new Thread(P1);
            Thread thread_P2 = new Thread(P2);

            thread_P1.start();
            thread_P2.start();
        }
    }

}
