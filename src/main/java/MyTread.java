
class MyThread extends Thread {

    private final int sleepTimeThreed = 2000;

    @Override
    public void run() {
        try {
            while (true) {
                if (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Привет от потока " + Thread.currentThread().getName());
                    Thread.sleep(sleepTimeThreed);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " + Thread.currentThread().getName() + " хотят прервать");
        } finally {
            System.out.println("Поток " + Thread.currentThread().getName() + " завершен\n");
        }
    }
}


