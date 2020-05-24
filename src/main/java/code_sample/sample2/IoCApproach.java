package code_sample.sample2;

public class IoCApproach {
    public static void main(String[] args){
        KlasaA a = new KlasaA(new KlasaB(), new KlasaC());
        a.doWork();
    }
}

class KlasaA{

    public KlasaA(KlasaInterface firstDependency, KlasaInterface secondDependency){
        this.firstDependency = firstDependency;
        this.secondDependency = secondDependency;
    }

    public void doWork(){
        firstDependency.doWork();
        secondDependency.doWork();
    }

    private KlasaInterface firstDependency;
    private KlasaInterface secondDependency;
}

interface KlasaInterface{
    public void doWork();
}

class KlasaB implements KlasaInterface{
    public void doWork(){
        System.out.println("Klasa B");
    }
}

class KlasaC implements KlasaInterface{
    public void doWork(){
        System.out.println("Klasa C");
    }
}