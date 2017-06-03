import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Xie on 2017.5.30.
 */
public class Zoo {
    @Autowired
    private Cat cat;
//
//    public Zoo(Animal animal){
//        this.animal = animal;
//    }

    public void hasAnimal(){
        cat.tellName();
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
        Zoo zoo = (Zoo)context.getBean("zoo");
        zoo.hasAnimal();
    }
}
