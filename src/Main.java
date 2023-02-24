public class Main {
    public static void main(String[] args) {

        Book book = new Book("polina",123, new Author("mark", "mark@", "f") );
        Book book1 = new Book("ABC",456, new Author("JEK", "JEk@", "f"));
        Book book2 = new Book("USE", 564,new Author("MEIK", "mEIk@", "f"));



          Book[] books= { book,book1,book2};
        for ( Book a:books) {
            System.out.println(a);

        }
    }
}