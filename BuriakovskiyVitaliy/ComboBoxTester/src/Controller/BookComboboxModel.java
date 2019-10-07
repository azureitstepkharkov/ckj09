
package Controller;

import Model.Book;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
//Назначение DefaultComboBoxModel - дать возможность
/*
Задавать свои правила редактирования данных для своего класса
Возможность отображать данные в интерфейсных компонентах
основанные на собственных классах

*/
//аналог DataSet из проектов на C#
public class BookComboboxModel extends DefaultComboBoxModel<Book>
{
    public BookComboboxModel(Vector<Book> books) 
    {
      super(books);
    }
    //единственный обязательный, который должен реализовать
    //уточнить
    @Override
    public Book getSelectedItem()
    {
        Book selectedUser = (Book) super.getSelectedItem();
        return selectedUser;
    }
}
