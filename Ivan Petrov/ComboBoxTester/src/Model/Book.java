package Model;

import java.util.Objects;

//не хватает только механизма сохранения в xml
public class Book
        implements Comparable<Book>
{
    //для Collections.sort(books);
    @Override
    public int compareTo(Book a) {
        return compare(a.title, this.title);
    }
    //для Arrays.sort(books);
    public int compare(String a, String b) {
       return b.compareTo(a);
    }
    
    private Book(){}
    private String title;

    public Book(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Book{" + "title=" + title + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
