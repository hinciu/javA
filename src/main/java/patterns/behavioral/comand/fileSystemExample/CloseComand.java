package patterns.behavioral.comand.fileSystemExample;

public class CloseComand implements Comand {
    FileSystemReceiver fileSystemReceiver;

    public CloseComand(FileSystemReceiver fileSystenReciever) {
        this.fileSystemReceiver = fileSystenReciever;
    }

    @Override
    public void execute() {
        fileSystemReceiver.close();
    }
}
