import java.util.ArrayList;
import java.util.List;

public class TestIsNotArrayList {
    public static void main(String[] args) {
        IsNotArrayList<Integer> list1 = new IsNotArrayList<>(4);
        list1.add(1);
        list1.add(7);
        list1.add(13);
        list1.add(222);
        list1.add(12);
        list1.add(1,1145);
        System.out.println(list1);
        System.out.println(list1.indexOf(13));
        System.out.println(list1.lastIndexOf(222));
        list1.remove(4);
        list1.set(3,777);
        System.out.println(list1.contains(0));
        System.out.println(list1);
    }
}
