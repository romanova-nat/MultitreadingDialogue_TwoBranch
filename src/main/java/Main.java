public class Main {
    public static void main(String[] args) throws InterruptedException {

        ThreadGroup group = new ThreadGroup("Группа");

        final Thread thread1 = new Thread(group, new MyThread(), "Один");
        final Thread thread2 = new Thread(group, new MyThread(), "Два");
        final Thread thread3 = new Thread(group, new MyThread(), "Три");
        final Thread thread4 = new Thread(group, new MyThread(), "Четыре");

        final int sleepTime = 15_000;


        System.out.println("Погнали...");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(sleepTime);
        group.interrupt();
    }
}




