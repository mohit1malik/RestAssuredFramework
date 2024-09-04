package JavaCode.collections.Map;

public class Book {

    String bookName, authorName, bookPublisher;
    int id,quantity;

    public Book(int id, String bookName, String authorName, String bookPublisher, int quantity){
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookPublisher = bookPublisher;
        this.quantity = quantity;
    }
}
