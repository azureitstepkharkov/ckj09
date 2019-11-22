package hibernatesingletablexmlmapingtest;

import javax.persistence.Entity; //@Entity
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; //@Id

@Entity
public class Employee {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY) 
       private long id = 1L;
       private String name;

       public Employee() {
       }

       public Employee(String fname) {
         name = fname;
       }

       public long getId() {
         return id;
       }

       public void setId(Long id) {
         this.id = id;
       }

       public String getName() {
         return name;
       }

       public void setName(String name) {
         this.name = name;
       }
    }

