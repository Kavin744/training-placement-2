class Counter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(Thread.currentThread().getName() + ": " + i);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.start();
        c2.start();
    }
}
