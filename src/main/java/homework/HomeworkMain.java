package homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HomeworkMain {
    public static void main(String[] args){
        ApplicationContext applicationContext = new GenericXmlApplicationContext("classpath:spring/homework.xml");
        System.out.println(applicationContext.getBean("MultifunctionalDevice", MultifunctionDevice.class));
    }
}
