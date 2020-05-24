package examples.example7;

import examples.example6.SystemOutMessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class NestedApplicationContext {
    public static void main(String[] args){
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext("classpath:spring/parent.xml");
        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:spring/child.xml");
        child.setParent(parent);
        child.refresh();
        System.out.println(child.getBean("consumer1", StringConsumer.class));
        System.out.println(child.getBean("consumer2", StringConsumer.class));
        System.out.println(child.getBean("consumer3", StringConsumer.class));
        child.close();
        parent.close();
    }
}
