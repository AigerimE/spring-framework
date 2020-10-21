import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
       // BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext(("config.xml"));
        Mentor mentor1 = (Mentor)container.getBean("fullTimeMentor");
        mentor1.createAccount();

        Mentor mentor2 = (Mentor)container.getBean("partTimeMentor");
        mentor2.createAccount();

        //other way
        Mentor mentor = container.getBean("fullTimeMentor", Mentor.class);
        mentor.createAccount();
    }
}
