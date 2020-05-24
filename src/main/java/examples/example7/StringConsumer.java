package examples.example7;

public class StringConsumer {

    private String _string;

    public StringConsumer(String _string){
        this._string = _string;
    }

    @Override
    public String toString() {
        return _string;
    }

}
