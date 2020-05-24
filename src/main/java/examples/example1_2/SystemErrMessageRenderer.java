package examples.example1_2;

public class SystemErrMessageRenderer implements MessageRenderer {

    private MessageProvider provider;

    @Override
    public void setProvider(MessageProvider provider) {
        this.provider = provider;
    }

    @Override
    public void render() {
        System.err.println("ERROR: " + provider.getMessage());
    }
}
