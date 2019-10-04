package controller;

import model.Book;

import javax.swing.DefaultComboBoxModel;
import java.util.Vector;

public class BookComboboxModel extends DefaultComboBoxModel {
    public BookComboboxModel(Vector<Book> books) {
        super(books);
    }
    public Book getSelectedItem(){
        Book selectedUser = (Book)super.getSelectedItem();
        return selectedUser;
    }
}
