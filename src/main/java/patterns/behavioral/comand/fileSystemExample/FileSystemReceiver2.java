package patterns.behavioral.comand.fileSystemExample;

public class FileSystemReceiver2 implements FileSystem {
    @Override
    public void openFile() {
        System.out.println("file system 2");
    }

    @Override
    public void close() {
        System.out.println("file system 2");
    }
}
