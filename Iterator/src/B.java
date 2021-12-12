import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class B {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> x = list.iterator();

        Thread a = new Thread(x);
        Thread b = new Thread(x);

        a.start();
        b.start();
    }
}
