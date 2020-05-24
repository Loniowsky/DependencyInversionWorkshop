package code_sample.sample1;

public class ClassicApproach{
    public static void main(String[] args){
        KlasaA a = new KlasaA();
        a.doWork();
    }
}

class KlasaA{

    public void doWork(){
        firstDependency.doWork();
        secondDependency.doWork();
    }

    private KlasaB firstDependency = new KlasaB();
    private KlasaC secondDependency = new KlasaC();
}

class KlasaB{
    public void doWork(){
        System.out.println("Klasa B");
    }
}

class KlasaC{
    public void doWork(){
        System.out.println("Klasa C");
    }
}



