package Batch2;

class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class HiThread extends Thread {
    public void run() {
        System.out.println("Hi");
    }
}

public class HiHelloThread {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        HiThread hiThread = new HiThread();

        // Start both threads
        helloThread.start();
        hiThread.start();
    }
}
