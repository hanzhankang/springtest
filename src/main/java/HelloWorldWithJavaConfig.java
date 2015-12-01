import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by kaka on 2015/12/2.
 */
public class HelloWorldWithJavaConfig {
    public static void main(String[] args){
        ApplicationContext config = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        HelloWorld helloWorld = config.getBean("helloWorld",HelloWorld.class);
        helloWorld.sayHello();

        config = new AnnotationConfigApplicationContext(AppConfig.class);
        helloWorld = config.getBean("helloWorld1",HelloWorld.class);
        helloWorld.sayHello();


    }
}
