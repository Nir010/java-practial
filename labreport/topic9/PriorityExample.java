package com.labreport.topic9;

public class PriorityExample {
    static class Priority extends Thread {
        public void run() {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        }

        public static void main(String[] args) {
            Priority t1 = new Priority();
            Priority t2 = new Priority();
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.MAX_PRIORITY);
            t1.start();
            t2.start();
        }
    }
}
