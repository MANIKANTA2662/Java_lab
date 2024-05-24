public class ThreadMessage {

    public static void main(String[] args) {
        // Create Runnable objects for each message
        Runnable oopsTask = new MessageTask("OOPS");
        Runnable throughTask = new MessageTask("Through");
        Runnable javaTask = new MessageTask("JAVA");

        // Create threads with the Runnable objects
        Thread oopsThread = new Thread(oopsTask);
        Thread throughThread = new Thread(throughTask);
        Thread javaThread = new Thread(javaTask);

        // Start the threads
        oopsThread.start();
        throughThread.start();
        javaThread.start();
    }
}

class MessageTask implements Runnable {

    private final String message;

    public MessageTask(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
