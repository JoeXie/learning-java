import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Xie on 2017.3.17.
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            c.add(i);
        for (Integer i : c)
            System.out.print(i + " ");
    }
}
