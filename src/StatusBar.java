public class StatusBar extends Thread {
    public static boolean isInterrupted=false;
    public void run() {
        try {
            while (!isInterrupted){
            Thread.sleep(1000);
            System.out.printf("* ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
