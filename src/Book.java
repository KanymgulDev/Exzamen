public class Book  {
     private   String bookName;
     private   int price;
     private  Author author;


    public Book(String bookName, int price, Author author) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
