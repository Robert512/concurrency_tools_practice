package org.jerry.threadcore.createthread;

public class BothRunnableThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是来自Runnable");
            }
        }) {
            @Override
            public void run() {
                System.out.println("我是来自Thread");
            }
        }.start();
    }
}
