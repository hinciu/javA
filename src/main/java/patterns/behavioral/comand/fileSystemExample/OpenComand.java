package patterns.behavioral.comand.fileSystemExample;

public class OpenComand implements Comand {

    FileSystem fileSystenReciever;

    public OpenComand(FileSystem fileSystenReciever) {
        this.fileSystenReciever = fileSystenReciever;
    }

    public void setFileSystenReciever(FileSystem fileSystenReciever) {
        this.fileSystenReciever = fileSystenReciever;
    }

    @Override
    public void execute() {
        fileSystenReciever.openFile();
    }
}
