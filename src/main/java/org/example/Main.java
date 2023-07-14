package org.example;

public class Main {
    public static void main(String[] args) {
        SingletonEager eagerInstance1 = SingletonEager.getInstance();
        SingletonEager eagerInstance2 = SingletonEager.getInstance();
        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2);

        SingletonStaticBlock staticBlock1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock staticBlock2 = SingletonStaticBlock.getInstance();
        System.out.println(staticBlock1);
        System.out.println(staticBlock2);

        SingletonLazy lazyInstance1 = SingletonLazy.getInstance();
        SingletonLazy lazyInstance2 = SingletonLazy.getInstance();
        System.out.println(lazyInstance1);
        System.out.println(lazyInstance2);

        SingletonThreadSafe threadSafe1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe threadSafe2 = SingletonThreadSafe.getInstance();
        System.out.println(threadSafe1);
        System.out.println(threadSafe2);

        SingletonBillPugh billPughInstance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh billPughInstance2 = SingletonBillPugh.getInstance();
        System.out.println(billPughInstance1);
        System.out.println(billPughInstance2);


    }
}