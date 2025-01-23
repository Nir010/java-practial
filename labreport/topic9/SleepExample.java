package com.labreport.topic9;

public class SleepExample {
    static class MyThread extends Thread {
        public void run() {
            try {
                System.out.println("Thread is sleeping.");
                Thread.sleep(1000);
                System.out.println("Thread woke up.");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        public static void main(String[] args) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}
