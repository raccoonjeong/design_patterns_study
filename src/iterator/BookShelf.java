package iterator;

import java.util.ArrayList;

// 서가
public class BookShelf implements Aggregate{
    private ArrayList<Book> books;
    // private int last = 0;
    public BookShelf() {
        this.books = new ArrayList<>();
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        this.books.add(book);
        // last ++;
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
