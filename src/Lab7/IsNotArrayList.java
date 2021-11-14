import java.util.*;

public class IsNotArrayList<E> {
    private int size = 0;
    private int capacity = 0;
    private final int CAPACITY = 16;
    private Object[] array;

    public IsNotArrayList() {
        capacity = CAPACITY;
        array = new Object[capacity];
    }
    //Конструктор по размеру
    public IsNotArrayList(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    //Расширение списка
    private void increaseCapacity() {
        capacity = capacity * 2;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
            array[i] = null;
        }
        array = newArray;
    }

    //Пустой ли список?
    public boolean isEmpty() {
        return size == 0;
    }

    //Содержит ли элемент
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    //Добавляем элемент в конец листа
    public boolean add(Object o) {
        if (size >= capacity) {
            increaseCapacity();
        }
        array[size++] = o;
        return true;
    }

    //сдвиг влево
    private void shiftToLeft(int start) {
        size--;
        if (size <= 0) {
            return;
        }
        if (size != start) {
            System.arraycopy(array, start + 1, array, start, size - start);
        }
        array[size] = null;
    }

    //Добавить коллекцию
    public boolean addAll(Collection c) {
        if (c == null) {
            return false;
        }
        if (c.isEmpty()) {
            return false;
        }
        for (Object item : c) {
            add(item);
        }
        return true;
    }

    //Получить элемент по индексу
    public E get(int index) {
        if ((index < size) && (index >= 0)) {
            return (E) array[index];
        }
        return null;
    }

    //Меняем элемент в заданной позиции
    public Object set(int index, Object element) {
        if ((index < size) && (index >= 0)) {
            Object o = array[index];
            array[index] = element;
            return o;
        }
        return null;
    }

    //Добавление по индексу
    public void add(int index, Object element) {
        if (index < 0) {
            return;
        }
        if (size + 1 >= capacity) {
            increaseCapacity();
        }
        if (index > size) {
            index = size;
        }
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    //Удаление по индексу
    public E remove(int index) {
        Object o = null;
        if ((index < size) && (index >= 0)) {
            o = get(index);
            shiftToLeft(index);
        }
        return (E) o;
    }

    //Первое вхождение элемента
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o == array[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    //Последнее вхождение элемента в лист
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) {
                    lastIndex = i;
                }
            }
            return lastIndex;
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(array[i])) {
                    lastIndex = i;
                }
            }
        }
        return lastIndex;
    }

    @Override
    public String toString() {
        return "IsNotArrayList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    //Содержит ли всю коллекцию?
    public boolean containsAll(Collection c) {
        if (c == null) {
            return false;
        }
        if (c.size() == 0) {
            return true;
        }
        for (Object e : c) {
            if (contains(e)) {
                ;
            } else {
                return false;
            }
        }
        return true;
    }

}
