package org.jerry.threadcore.createthread;

public class ThreadStyle extends Thread {
    public static void main(String[] args) {
        new ThreadStyle().start();
    }

    @Override
    public void run() {
        System.out.println("用Thread方式创建线程");
    }
}
