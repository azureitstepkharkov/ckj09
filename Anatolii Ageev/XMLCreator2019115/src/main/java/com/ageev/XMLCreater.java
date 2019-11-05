package com.ageev;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class XMLCreater {
    public static void main(String[] args) {
        Users users = new Users();

        try {

            File file = new File("D:\\Java\\file.xml");
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

    private static void loadObjectFromXmlFile(){
        try {

            File file = new File("C:\\MyData\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Users users = (Users) jaxbUnmarshaller.unmarshal(file);
            System.out.println(users.getUsers());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


}
