import com.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = context.getBean("java", Course.class);

        Course course2 = context.getBean("java", Course.class);

        System.out.println("pointing to othe same object :" + (course1));
    }
}
