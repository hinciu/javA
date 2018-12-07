package patterns.structural.decorator.impl;

import patterns.structural.decorator.FileReaderComponent;

public class FileReaderDecorator implements FileReaderComponent {
    private FileReaderComponent fileReaderComponent;

    public FileReaderDecorator(FileReaderComponent fileReaderComponent) {
        this.fileReaderComponent = fileReaderComponent;
    }

    @Override
    public String readFile() {
        return fileReaderComponent.readFile();
    }
}
