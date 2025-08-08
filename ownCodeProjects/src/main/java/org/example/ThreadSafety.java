package org.example;

public class ThreadSafety {
    private int count = 0;

    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

    public static void main(String[] args) throws Exception {
        ThreadSafety obj = new ThreadSafety();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        };

        Thread T1 = new Thread(task);
        Thread T2 = new Thread(task);
        T1.start();
        T2.start();
        System.out.println( obj.getCount() );
    }
}
