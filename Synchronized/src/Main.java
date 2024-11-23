public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        thread.start();
        thread1.start();

        // neu khong co synchronized in Counter se khong ra 2000 , ra kq ngau nhien
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Count = "+counter.getCount());
    }
}