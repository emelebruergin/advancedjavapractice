package advancedJavaPrc.serialization;

import java.io.Serializable;

public class Book implements Serializable {
    private  String name;
    private String author;
    private Integer PublishDate;

    public Book(String name, String author, Integer publishDate) {
        this.name = name;
        this.author = author;
        PublishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(Integer publishDate) {
        PublishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", PublishDate=" + PublishDate +
                '}';
    }
}
