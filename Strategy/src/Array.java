import java.util.List;

public class Array implements ListConverter{
    int i = 0;

    public void listToString(List<String> list){
        String[] array = list.toArray(new String[0]);

        for (String j : array){
            System.out.println(j);
            i++;
            if (i % 3 == 0){
                System.out.print("\n");
            }
        }
    }
}
