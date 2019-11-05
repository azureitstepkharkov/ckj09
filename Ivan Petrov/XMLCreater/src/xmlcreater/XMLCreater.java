package xmlcreater;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class XMLCreater {


    public static void main(String[] args) 
    {
        //
        User customer = new User();
        customer.setId(100);
        customer.setName("Вася");
        customer.setAge(29);
        //
        User customer2 = new User();
        customer2.setId(200);
        customer2.setName("Петя");
        customer2.setAge(25); 
        //
        Users users = new Users();
        users.getUsers().add(customer);
        users.getUsers().add(customer2);
        //
        try {
            //файл с результатом
            File file = new File("C:\\MyData\\file.xml");
            //механизм создания структуры XML
            //JAXBContext - анализирует структуру класса. учитывает аттрибуты
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            //механизм выгрузки
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // задал алгоритм выгрузки
            //jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //выполнил вугрузку содержимого коллекции
            jaxbMarshaller.marshal(users, file);//в файл
            jaxbMarshaller.marshal(users, System.out);//на экрана
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        //
        System.out.println("информация из файла d:\\MyData\\file.xml");
        loadObjectsFomXmlFile();
        //
    }

    private static void loadObjectsFomXmlFile() 
    {
     
    
    }
    
}
