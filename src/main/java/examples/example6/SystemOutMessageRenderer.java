package examples.example6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("renderer")
public class SystemOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    @Override
    @Autowired
    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }
}
