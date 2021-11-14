import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Piyanitsa{
    private Queue<Integer> firstPack;
    private Queue<Integer> secondPack;

    public Piyanitsa(){
        firstPack = new LinkedList<Integer>();
        secondPack = new LinkedList<Integer>();
    }

    public void start() {
        enterValueCard();
        compareCard();
    }

    private void enterValueCard() {
        Scanner f = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            firstPack.add(f.nextInt());
        }
        //Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            secondPack.add(f.nextInt());
        }
    }

    private void compareCard() {
        int i = 0;
        while(!secondPack.isEmpty() && !firstPack.isEmpty()) {
            int a = firstPack.peek();
            int b = secondPack.peek();
            if((a > b && (a != 9 || b != 0)) || (a == 0 && b == 9)) {
                firstPack.add(a);
                firstPack.add(b);
            }
            else{
                secondPack.add(a);
                secondPack.add(b);
            }
            firstPack.remove();
            secondPack.remove();
            ++i;
        }
        if(firstPack.isEmpty())
            System.out.println("second " + i);
        else
            System.out.println("first " + i);
    }

}
