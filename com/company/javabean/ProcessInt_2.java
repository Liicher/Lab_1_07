package com.company.javabean;

public class ProcessInt_2 implements ProcessInt, Runnable {
    int[] Array;
    int N;

    public ProcessInt_2() {
        this.Array = choiceGenerator.getArrayInt();
        this.N = choiceGenerator.getLen();
    }

    @Override
    public void run() {
        process(N, Array);
    }

    public void process(int N, int[] Array_Int) {
        var processObserverInt2 = new ProcessObserver();
        new Logger("Обработчик целых №2", processObserverInt2);

        int count = 0;
        Choice choice = new Choice();       // Метод выбора
        //int key = choice.choice(2);   // Выбор пользователя
        int key = 1;
        int j = 0;

        switch (key) {
            // Удаление нечетных
            case 1:
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 0) {
                        count++;
                    }
                }

                int[] Array_2 = new int[count];
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 0) {
                        Array_2[j] = Array_Int[i];
                        j++;
                    }
                }

                StringBuilder sb1 = new StringBuilder();
                for(int i = 0; i < count; i++) {
                    sb1.append(Array_2[i]).append(" ");
                }
                processObserverInt2.setContent("\nОбновленный массив - " + sb1 + "\n");
                break;

            // Удаление четных
            case 2:
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 1) {
                        count++;
                    }
                }

                Array_2 = new int[count];
                for (int i = 0; i < N; i++) {
                    if (Array_Int[i]%2 == 1) {
                        Array_2[j] = Array_Int[i];
                        j++;
                    }
                }

                StringBuilder sb2 = new StringBuilder();
                for(int i = 0; i < count; i++) {
                    sb2.append(Array_2[i]).append(" ");
                }
                processObserverInt2.setContent("\nОбновленный массив - " + sb2 + "\n");
                break;

            default:
                break;
        }
    }
}
