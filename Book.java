package book;
public class Book {
    public static void main(String[] args) {
        Copy first = new Copy();
        Copy second = new Copy();
        Copy third = new Copy();
        
        first.setTitle("hello");
        second.setTitle("bye");
        third.setTitle("okay");
        first.setAuthor("santino");
        second.setAuthor("raj");
        third.setAuthor("baboo");
        first.setPrice(9.99);
        second.setPrice(19.99);
        third.setPrice(99.99);
        
        System.out.println(first.getTitle() + " " + first.getAuthor() + " " + first.getPrice());
        System.out.println(second.getTitle() + " " + second.getAuthor() + " " + second.getPrice());
        System.out.println(third.getTitle() + " " + third.getAuthor() + " " + third.getPrice());
    }
}
