package examples.example1_2;

import java.util.Properties;

public class HelloWorldIoC {
    public static void main(String[] args){
        MessageFactory messageFactory = MessageFactory.getInstance();
        MessageRenderer renderer = messageFactory.getRenderer();
        renderer.setProvider(messageFactory.getProvider());
        renderer.render();
    }
}

class MessageFactory{

    public static MessageFactory getInstance() {
        return instance;
    }

    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }

    private MessageFactory(){
        Properties properties = new Properties();

        try{
            properties.load(this.getClass().getResourceAsStream("/helloWorld.properties"));
            String renderClassName = properties.getProperty("renderer.class");
            String providerClassName = properties.getProperty("provider.class");

            renderer = (MessageRenderer)Class.forName(renderClassName).getDeclaredConstructor().newInstance();
            provider = (MessageProvider)Class.forName(providerClassName).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static MessageFactory instance;
    private MessageRenderer renderer;
    private MessageProvider provider;

    static{
        instance = new MessageFactory();
    }
}