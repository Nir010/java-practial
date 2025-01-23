package com.labreport.topic9;

public class ThreadExample {
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread is running.");
        }

        public static void main(String[] args) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}
