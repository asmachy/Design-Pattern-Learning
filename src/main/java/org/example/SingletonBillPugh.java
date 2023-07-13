package org.example;

public class SingletonBillPugh {
    private SingletonBillPugh() {

    }

    public static class SingletonBillPughInnerClass {
        public static final SingletonBillPugh instance = new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance() {
        return SingletonBillPughInnerClass.instance;
    }
}
