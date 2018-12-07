package patterns.structural.decorator.impl;

import patterns.structural.decorator.FileReaderComponent;

public class HddFileReaderPlusZip extends FileReaderDecorator {
    public HddFileReaderPlusZip(FileReaderComponent fileReaderComponent) {
        super(fileReaderComponent);
    }

    @Override
    public String readFile() {
        return super.readFile() + " zipped ";

    }
}
