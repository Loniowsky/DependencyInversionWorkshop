package examples.example6;

import org.springframework.stereotype.Component;

@Component("provider")
public class GenericMessageProvider implements MessageProvider {

    private String message;

    public GenericMessageProvider(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
