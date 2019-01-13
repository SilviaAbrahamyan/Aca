package com.homeworks.aca_book.multithreading;

/**
 * Created by home on 10/30/2018.
 */
public class LiftOff implements Runnable {
    protected int countDown = 10; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;
public LiftOff() {}
public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    public void run() {
        while(countDown-- > 0) {
            System.out.print(status());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new LiftOff());
      //  Thread t2 = new Thread(new LiftOff());
        t.start();
        //t2.start();
        System.out.println("Waiting for LiftOff");
    }
}