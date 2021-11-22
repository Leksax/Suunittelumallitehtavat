import java.util.List;

public class Composition {
    private ListConverter converter;

    public Composition(ListConverter converter){
        this.converter = converter;
    }
    public void print(List<String> list){
        converter.listToString(list);
    }
}
