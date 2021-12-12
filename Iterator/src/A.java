import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> x = list.iterator();
        Iterator<Integer> y = list.iterator();

        Thread a = new Thread(x);
        Thread b = new Thread(y);

        a.start();
        b.start();
    }
}
