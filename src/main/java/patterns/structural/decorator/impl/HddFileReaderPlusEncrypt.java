package patterns.structural.decorator.impl;

import patterns.structural.decorator.FileReaderComponent;

public class HddFileReaderPlusEncrypt extends FileReaderDecorator {
    public HddFileReaderPlusEncrypt(FileReaderComponent fileReaderComponent) {
        super(fileReaderComponent);
    }

    @Override
    public String readFile() {
        return  super.readFile() + " encrypted ";

    }
}
