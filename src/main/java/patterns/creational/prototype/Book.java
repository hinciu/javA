package patterns.creational.prototype;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Book{

    List<String> content;

    public Book(String bookName) {
        content = new ArrayList<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader("src\\main\\java\\patterns\\prototype\\" + bookName));
            String line;
            while ((line = bf.readLine()) != null) {
                content.add(line);
            }
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Book(List<String> content) {
      this.content = new ArrayList<>(content);
    }

    public void clear(){
        content.clear();
    }


    public List<String> getContent() {
        return content;
    }

    protected Book clone()  {
      return new Book(content);
    }
}
