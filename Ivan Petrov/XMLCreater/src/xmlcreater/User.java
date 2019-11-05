package xmlcreater;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class User 
{

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public User() {
    }
    public User(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", age=" + age + ", id=" + id + '}';
    }
    @XmlElement
    private String name;
    @XmlElement
    int age;
    //@XmlElement
    @XmlAttribute(name = "IDENTITY", required = true)
    int id;
}
