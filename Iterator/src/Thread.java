import java.util.Iterator;

public class Thread extends java.lang.Thread {

    Iterator<Integer> i;

    public Thread(Iterator<Integer> i) {
        this.i = i;
    }

    public void run() {
        while (this.i.hasNext()) {
            Integer j = this.i.next();
            System.out.println(j);
        }
    }
}
