package Controller;

import Model.Book;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class BookComboboxModel extends DefaultComboBoxModel<Book>
{

    public BookComboboxModel(Vector<Book> books) 
    {
        super(books);
    }
    
    @Override
    public Book getSelectedItem()
    {
        Book selectedUser = (Book) super.getSelectedItem();
        return selectedUser;
    }
    
    
}
