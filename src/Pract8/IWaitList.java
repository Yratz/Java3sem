import java.util.Collection;


public interface IWaitList<E> {
    void add(E n);
    E remove();
    public boolean contains(E element);
    public boolean containsAll(Collection<E> c);
    public boolean isEmpty();
}
