public class Counter {
    private int count = 0;

    // dong bo hoa tien trinh
    // vd rut tien+ nap tien
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
