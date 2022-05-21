package com.company.javabean;

public class ProcessString_1 implements ProcessString, Runnable {

    String[] Array;     // Массив сгенерированных строк
    int N;              // Объем данных

    public ProcessString_1() {
        this.Array = choiceGenerator.getArrayStr();
        this.N = choiceGenerator.getLen();
    }

    public void process(int N, String[] Array_Str)  // Склейка строк
    {
        var processObserverStr1 = new ProcessObserver();
        new Logger("Обработчик строк №1", processObserverStr1);

        // Массив для склееных строк
        String[] array_2 = new String[N];
        for(int i = 0; i < N; i++) {
            String edited = Array[i].replaceAll(" ", "");
            array_2[i] = edited;
        }

        StringBuilder sb1 = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb1.append(array_2[i]).append("\n");
        }
        processObserverStr1.setContent("\nОбновленный массив:\n" + sb1 + "\n");
    }

    @Override
    public void run() {
        process(N, Array);
    }
}
