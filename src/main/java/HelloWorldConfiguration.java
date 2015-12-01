import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kaka on 2015/12/2.
 */

@Configuration
public class HelloWorldConfiguration {
    @Bean(name = "helloWorld")
    public HelloWorld helloWorld(){
        HelloWorld helloWorldBean = new HelloWorld();
        helloWorldBean.setWord("Hello world!");
        return helloWorldBean;
    }
}
