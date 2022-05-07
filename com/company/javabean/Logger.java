package com.company.javabean;

public class Logger implements Observer
{
    private final String name;

    public Logger(String name, Observable o) {
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void update(String content) {
        System.out.println(name + " выполнил задачу: " + content);
    }
}
