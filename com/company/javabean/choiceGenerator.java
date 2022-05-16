package com.company.javabean;

import com.company.javabean.Choice;

public class choiceGenerator {
    private static int[] ArrayInt;
    private static String[] ArrayStr;
    private static int len;
    private static int type;

    public choiceGenerator(int key) {
        generation(key);
    }

    public void generation(int key) {
        Process process = new Process();
        Choice choice = new Choice();

        switch (key) {
            case 1:
                fileGenerator fG = new fileGenerator();
                fG.generate();

                len = fG.getLen();
                type = fG.getType();

                if(type == 1) {
                    ArrayInt = fG.getArrayInt();
                } else {
                    ArrayStr = fG.getArrayStr();
                }
                process.process(type);
                break;

            case 2:
                inputGenerator iG = new inputGenerator();
                iG.generate();

                len = iG.getLen();
                type = iG.getType();

                if(type == 1) {
                    ArrayInt = iG.getArrayInt();
                } else {
                    ArrayStr = iG.getArrayStr();
                }
                process.process(type);
                break;

            case 3:
                randGenerator rG = new randGenerator();
                rG.generate();

                len = rG.getLen();
                type = rG.getType();

                if(type == 1) {
                    ArrayInt = rG.getArrayInt();
                } else {
                    ArrayStr = rG.getArrayStr();
                }
                process.process(type);
                break;

            default:
                break;
        }
    }
    public static int[] getArrayInt() {return ArrayInt;}
    public static String[] getArrayStr() {return ArrayStr;}
    public static int getLen() {return len;}
}
