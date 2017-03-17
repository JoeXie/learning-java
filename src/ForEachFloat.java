import java.util.Random;

/**
 * Created by Xie on 2017.3.17.
 */
public class ForEachFloat {
    public static void main(String[] args) {
        Random rand = new Random(10);
        float f[] = new float[10];

        for (int i = 0; i < 10; i++) {
            f[i] = rand.nextFloat();
        }
        for (float x : f)
            System.out.println(x);
    }

}
