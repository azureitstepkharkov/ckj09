
package xmlcreater;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLCreater {

  
    public static void main(String[] args) {
      try {

            File file = new File("D:\\ckj09\\Zaharchuk Aleksandr\\XMLCreaterTXT\\file.xml");
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
    
}
