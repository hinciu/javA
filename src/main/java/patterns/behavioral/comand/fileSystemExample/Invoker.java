package patterns.behavioral.comand.fileSystemExample;

public class Invoker {

    Comand comand;

    public Invoker(Comand comand) {
        this.comand = comand;
    }

    public void execute(){
        this.comand.execute();
    }
}
