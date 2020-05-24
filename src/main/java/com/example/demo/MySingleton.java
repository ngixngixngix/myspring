package com.example.demo;

public class MySingleton {

    private MySingleton() {
    }

    private volatile static MySingleton instance;

    public static MySingleton getInstance() {
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null){
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(EventType.a.val == EventType.b.val);
    }

    public static enum EventType{
        a(1),
        b(1);

        EventType(int a){
            this.val = a;
        }
        private int val;
    }
}

