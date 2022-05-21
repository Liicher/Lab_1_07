package com.company.javabean;

public class ProcessInt_1 implements ProcessInt, Runnable {
    int[] Array;                    // Массив с данными
    int N;                          // Объем данных

    public ProcessInt_1() {
        this.Array = choiceGenerator.getArrayInt();
        this.N = choiceGenerator.getLen();
    }

    @Override
    public void run() {
        process(N, Array);
    }

    public void process(int N, int[] Array_Int) {
        var processObserverInt1 = new ProcessObserver();
        new Logger("Обработчик целых №1", processObserverInt1);

        // Сумма всех данных
        double sum = 0;                         // Сумма
        double average;                         // Среднее значение
        double min = 1000;                      // Минимальное значение
        double max = 0;                         // Максимальное значение

        for(int i = 0; i < N; i++) {
            sum = sum + Array_Int[i];

            if (Array_Int[i] < min) {
                min = Array_Int[i];
            }

            if (Array_Int[i] > max) {
                max = Array_Int[i];
            }
        }
        average = sum / N;

        processObserverInt1.setContent("\nСумма = " + sum +
                "\nМинимальное значение = " + min +
                "\nМаксимальное значение = " + max +
                "\nСреднее значение = " + average + "\n");
    }
}
