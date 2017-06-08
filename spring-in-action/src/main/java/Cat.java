import org.springframework.stereotype.Component;

/**
 * Created by Xie on 2017.5.30.
 */
@Component
public class Cat implements Animal {

    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void tellName() {
        System.out.printf(name);
    }
}
