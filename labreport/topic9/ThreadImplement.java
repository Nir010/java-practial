package com.labreport.topic9;

public class ThreadImplement {
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread is running.");
        }
        public static void main(String[] args) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
}
