import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{
    ConcurrentLinkedQueue<E> blackList;

    public UnfairWaitList() {
        content = new ConcurrentLinkedQueue<>();
        blackList = new ConcurrentLinkedQueue<>();
    }

    @Override
    public void add(E n) {
        if(!blackList.contains(n))
            content.add(n);
    }

    public void remove(E element) {
        if(content.element() != element) {
            content.remove(element);
            blackList.add(element);
        }
    }
    public void moveToBack(E element) {
        if(content.contains(element)) {
            content.remove(element);
            content.add(element);
        }
    }
}
