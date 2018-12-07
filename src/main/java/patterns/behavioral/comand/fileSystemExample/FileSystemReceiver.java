package patterns.behavioral.comand.fileSystemExample;

public class FileSystemReceiver implements FileSystem {

    public void openFile(){
        System.out.println("open");
    }
    public void close(){
        System.out.println("close");
    }
}
