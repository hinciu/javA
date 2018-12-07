package patterns.structural.decorator.impl;

import patterns.structural.decorator.FileReaderComponent;

public class HddFileReader implements FileReaderComponent {
    String fileName;
    public HddFileReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String readFile() {
        return fileName + " retrieved ";
    }
}
