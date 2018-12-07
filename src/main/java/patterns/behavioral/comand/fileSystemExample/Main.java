package patterns.behavioral.comand.fileSystemExample;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystenReciever = new FileSystemReceiver();
        FileSystem fileSystenReciever2 = new FileSystemReceiver2();
        OpenComand openComand = new OpenComand(fileSystenReciever);
        Invoker invoker = new Invoker(openComand);
        invoker.execute();
        openComand.setFileSystenReciever(fileSystenReciever2);
        invoker.execute();
    }
}
