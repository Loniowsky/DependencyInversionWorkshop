package homework;

public class MultifunctionDevice {

    private Printer printer;
    private Scanner scanner;
    private Xero xero;

    public MultifunctionDevice(Printer printer, Scanner scanner, Xero xero){
        this.printer = printer;
        this.scanner = scanner;
        this.xero = xero;
    }

    @Override
    public String toString() {
        return "MultifunctionDevice{" +
                "printer=" + printer +
                ", scanner=" + scanner +
                ", xero=" + xero +
                '}';
    }
}
