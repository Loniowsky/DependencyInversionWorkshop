package examples.example8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class InstantiationModes {

    public static void main(String[] args){
        ApplicationContext applicationContext = new GenericXmlApplicationContext("classpath:spring/instantiation.xml");

        Counter singleton1 = applicationContext.getBean("singleton", Counter.class);
        Counter singleton2 = applicationContext.getBean("singleton", Counter.class);

        singleton1.count();
        singleton2.count();

        Counter prototype1 = applicationContext.getBean("prototype", Counter.class);
        Counter prototype2 = applicationContext.getBean("prototype", Counter.class);

        prototype1.count();
        prototype2.count();
    }

}

class Counter{
    private int _count = 0;

    public void count(){
        System.out.println(_count++);
    }
}
