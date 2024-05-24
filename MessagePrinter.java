public class MessagePrinter {

    public static void main(String[] args) {
        // Create three threads
        Thread goodMorningThread = new GoodMorningThread();
        Thread helloThread = new HelloThread();
        Thread welcomeThread = new WelcomeThread();

        // Start the threads
        goodMorningThread.start();
        helloThread.start();
        welcomeThread.start();
    }
}

class GoodMorningThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WelcomeThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
