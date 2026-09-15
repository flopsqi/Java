public class Pr14 {
    public static void main(String[] args) {

        Thread thread = new Thread(new NumberTask());
        thread.start();

        Thread thread2 = new Thread(new LetterTask());
        thread2.start();
    }
    static class NumberTask implements Runnable {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class LetterTask implements Runnable {
        public void run() {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
