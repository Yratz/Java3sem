import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    /**
     *
     * @param c
     */


    public BoundedWaitList(int c) {
        capacity = c;
        content = new ConcurrentLinkedQueue<>();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E n) {
        if(content.size() < capacity)
            content.add(n);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
