
package Model;

import java.util.Objects;

//не хватает только механихма сохранения в xml
public class Book implements Comparable<Book>
{
    //для сортировки Collections.sort(books);
    @Override
    public int compareTo(Book a) {
        return compare(a.title, this.title);
    }
    //для сортировки Arrays.sort(books);
    public int compare(String a, String b) {
       return b.compareTo(a);
    }
    
    private Book(){}

    public Book(Integer id, String title, Integer authorsId, Integer year) {
        this.id = id;
        this.title = title;
        this.authorsId = authorsId;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAuthorsId() {
        return authorsId;
    }

    public void setAuthorsId(Integer authorsId) {
        this.authorsId = authorsId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", authorsId=" + authorsId + ", year=" + year + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.title);
        hash = 11 * hash + Objects.hashCode(this.authorsId);
        hash = 11 * hash + Objects.hashCode(this.year);
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.authorsId, other.authorsId)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }
    
    private Integer id;
    private String title;
    private Integer authorsId;
    private Integer year;


}