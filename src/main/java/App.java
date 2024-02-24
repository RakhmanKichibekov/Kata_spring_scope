import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Равны ли бины helloworld ? - " + (helloWorldBean == helloWorldBean2));
        System.out.println("Равны ли бины cat ? - " + (catBean == catBean2));
    }
}