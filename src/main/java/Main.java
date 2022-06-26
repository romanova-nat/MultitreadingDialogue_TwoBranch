import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final ExecutorService threads = Executors.newFixedThreadPool(4);
        final int sleepTime = 5_000;

        System.out.println("Погнали...");

        final List<Future> task = new ArrayList<>();

        task.add(threads.submit(new MyThread("Один")));
        task.add(threads.submit(new MyThread("Два")));
        task.add(threads.submit(new MyThread("Три")));
        task.add(threads.submit(new MyThread("Четыре")));

        Thread.sleep(sleepTime);
        threads.shutdownNow();

        for (Future<String> future : task) {
            try {
                System.out.println(future.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}




