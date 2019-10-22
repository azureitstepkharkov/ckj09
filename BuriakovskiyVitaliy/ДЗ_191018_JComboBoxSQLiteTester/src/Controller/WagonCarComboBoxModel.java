package Controller;

import Model.WagonCar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class WagonCarComboBoxModel extends DefaultComboBoxModel<WagonCar>
{
    public  WagonCarComboBoxModel(Vector<WagonCar> employees)
    {
        super(employees);
    }

    //единственный обязательный, который должен реализовать
    //уточнить
    @Override
    public WagonCar getSelectedItem()
    {
        WagonCar selectedUser = (WagonCar) super.getSelectedItem();
        return selectedUser;
    }
}