import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<String> list = new LinkedList<>();

        list.add("Kello");
        list.add("neljä");
        list.add("yöllä");
        list.add("ei");
        list.add("kannattais");
        list.add("tehä");
        list.add("läksyjä");
        list.add("mutta");
        list.add("minkäs");
        list.add("teet");
        list.add("kun");
        list.add("deadline");
        list.add("on");
        list.add("viiden");
        list.add("tunnin");
        list.add("päästä");

        Composition iteratori = new Composition(new Iteratori());
        iteratori.print(list);

        Composition forloop = new Composition(new forLoop());
        forloop.print(list);

        Composition array = new Composition (new Array());
        array.print(list);
    }
}
