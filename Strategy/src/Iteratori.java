import java.util.Iterator;
import java.util.List;

public class Iteratori implements ListConverter{
    @Override
    public void listToString(List<String> list) {
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + "\n");
        }
    }
}
