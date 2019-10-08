package Controller;

import Model.Book;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class BookComboBoxModel extends DefaultComboBoxModel<Book>{

    public BookComboBoxModel(Vector<Book> books) {
        super(books);
    }
    @Override
    public Book getSelectedItem(){
        Book selectUser = (Book) super.getSelectedItem();
        return selectUser ;
    }
    
}
