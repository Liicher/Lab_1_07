package com.company.javabean;

import com.company.javabean.fileGenerator;

public class choiceGenerator {
    private static int key;
    private static int[] ArrayInt;
    private static String[] ArrayStr;
    private static int len;

    public choiceGenerator(int key) {
        this.key = key;
        generation(key);
    }

    public void generation(int key) {
        Process process = new Process();

        switch (key) {
            case 1:
                fileGenerator fG = new fileGenerator();
                fG.generate();
                len = fG.getLen();
                int type = fG.getType();
                if(type == 1) {
                    ArrayInt = fG.getArrayInt();
                } else {
                    ArrayStr = fG.getArrayStr();
                }
                process.process(type);
                break;

            case 2:
                break;

            case 3:
                randGenerator rG = new randGenerator();
                rG.generate();
                break;

            default:
                break;
        }
    }

    public static int getKey() {return key;}
    public static int[] getArrayInt() {return ArrayInt;}
    public static String[] getArrayStr() {return ArrayStr;}
    public static int getLen() {return len;}
}
