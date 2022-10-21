package ClassesAndObjects.task15;

import ClassesAndObjects.task12.Book;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}
