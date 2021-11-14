import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> content;


    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> con) {
        content = new ConcurrentLinkedQueue<>(con);
    }

    @Override
    public void add(E n) {
        content.add(n);
    }
    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
