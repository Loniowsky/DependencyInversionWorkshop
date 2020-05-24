package examples.example9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AutowireTypes {

    public static void main(String[] args){
        ApplicationContext applicationContext = new GenericXmlApplicationContext("classpath:spring/autowire.xml");
        StringHolder byType = applicationContext.getBean("byType", StringHolder.class);
        StringHolder byName = applicationContext.getBean("byName", StringHolder.class);
        StringHolder constructor = applicationContext.getBean("constructor", StringHolder.class);

        System.out.println(byType);
        System.out.println(byName);
        System.out.println(constructor);
    }
}

class StringConsumer{
    private String _string;

    public StringConsumer(String _string){
        this._string = _string;
    }

    @Override
    public String toString() {
        return _string;
    }
}

class StringConsumerChild extends StringConsumer{

    public StringConsumerChild(String _string) {
        super(_string);
    }

    @Override
    public String toString() {
        return "Child:" + super.toString();
    }
}

class StringHolder{
    private StringConsumer stringConsumerChild;

    public StringHolder(){}

    public StringHolder(String additionalMessage, StringConsumer stringConsumer){
        this.stringConsumerChild = new StringConsumer(additionalMessage+stringConsumer);
    }

    public void setStringConsumerChild(StringConsumer stringConsumerChild) {
        this.stringConsumerChild = stringConsumerChild;
    }

    @Override
    public String toString() {
        return stringConsumerChild.toString();
    }
}