package lambdaexpressiontest;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Employee implements Comparable<Employee>
{
    @Override
    public int compareTo(Employee t) 
    {
        return t.name.compareTo(name);
    }
    //hashCode() + equals - для устойчивости в коллекциях
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.age;
        hash = 67 * hash + this.salary;
        return hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.salary != other.salary) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    //для устойчивости в лямбда выражениях
    //numbers.forEach(System.out::println);//только java 9+
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", salary=" + salary + '}';
    }

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    protected Employee() 
    {
        
    }
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
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @XmlElement
    private String name;
    @XmlElement
    private int age;
    @XmlElement
    private int salary;
    //для работы механизмов рефлексии Hibernate
    //должны быть сет и гет методы для КАЖДОГО
    //поля - из таблицы
    //с правильным форматом имени setAge
    //как делает мастер Netbeans

}
