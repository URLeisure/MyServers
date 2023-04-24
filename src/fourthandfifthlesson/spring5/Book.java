package fourthandfifthlesson.spring5;

/**
 * @author: URLeisure
 * @description: TODO 类描述
 * @create: 2023/03/20 8:50
 **/

public class Book {
    private String name;
    private String author;

    private String address;
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", address='" + address + '\''+
                '}';
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
