import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("hello world is created");
        System.out.println(helloWorld.getMessage());
        return helloWorld;
    }

    @Bean(name = "cat")
    @Scope("prototype")
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setMessage("cat is created");
        System.out.println(cat.getMessage());
        return cat;
    }
}