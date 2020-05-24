package examples.example1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldIoCSpring {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/hello-world-2.xml");
        MessageRenderer renderer = applicationContext.getBean("renderer", MessageRenderer.class);
        renderer.setProvider((MessageProvider)applicationContext.getBean("provider"));
        renderer.render();
    }
}
