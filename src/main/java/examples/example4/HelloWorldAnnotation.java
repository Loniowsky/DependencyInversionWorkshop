package examples.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class HelloWorldAnnotation {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MessageRenderer renderer = applicationContext.getBean("renderer", MessageRenderer.class);
        renderer.render();
    }
}

@Configuration
@ComponentScan(basePackages = "examples.example4")
class HelloWorldConfiguration { }
