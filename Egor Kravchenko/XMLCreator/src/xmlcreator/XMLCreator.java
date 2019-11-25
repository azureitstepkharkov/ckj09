package xmlcreator;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class XMLCreator {

    public static void main(String[] args) {
        User customer1 = new User();
        customer1.setId(100);
        customer1.setName("Вася");
        customer1.setAge(29);

        User customer2 = new User();
        customer2.setId(200);
        customer2.setName("Вася 2");
        customer2.setAge(39);

        Users users = new Users();
        users.getUsers().add(customer1);
        users.getUsers().add(customer2);
        
        try {

            File file = new File("D:\\MyData\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(users, file);
            jaxbMarshaller.marshal(users, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
        
        
        
    }
    
    private static void loadObjectsFomXmlFile() { // получение данных из XML
        try {

            File file = new File("D:\\MyData\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Users users = (Users) jaxbUnmarshaller.unmarshal(file);
            System.out.println(users.getUsers());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    
}
