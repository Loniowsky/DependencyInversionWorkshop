package extras.method_replacement;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MethodReplacementDemo {

    public static void main(String[] args){
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("classpath:spring/method-replacement.xml");
        System.out.println(applicationContext.getBean("notReplaced", Target.class));
        System.out.println(applicationContext.getBean("replaced", Target.class));
    }

}
