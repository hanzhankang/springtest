import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by kaka on 2015/12/2.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class AppConfig {
    //test 1--------------------
    @Autowired
    Environment env;

    @Bean(name = "helloWorld1")
    public HelloWorld myBean() {
        HelloWorld helloWorldBean = new HelloWorld();
        helloWorldBean.setWord(env.getProperty("app.name"));
        return helloWorldBean;
    }

}
