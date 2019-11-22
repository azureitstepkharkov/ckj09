
package onetomanyjpatest;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column; 
import javax.persistence.Entity; //@Entity
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; //@Id
import javax.persistence.OneToMany;
import javax.persistence.Table; 
import javax.persistence.UniqueConstraint; 

@Entity //!! 
@Table(name = "Employees") 
public class Employees implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeesId", unique = true, nullable = false)
    private long employeesId; 
    @Column(name = "Employees_Name", unique = false, nullable = false, length = 100)
    private String employees_Name; 
    @Column(name = "IdCode", unique = false, nullable = false)
    private Integer idCode; 
    public Employees() {
    }
    public Employees(String name, int idCode) {
        this.employees_Name = name;
        this.idCode = idCode;
    }
    public long getEmployeesId() {
        return employeesId;
    }
    public void setEmployeesId(long employeesId) {
        this.employeesId = employeesId;
    }
    public String getEmployees_Name() {
        return employees_Name;
    }
    public void setEmployees_Name(String employees_Name) {
        this.employees_Name = employees_Name;
    }
    public int getIdCode() {
        return idCode;
    }
    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }   
    //
    @Override
    public String toString() {
        return "Employee{"
                + "id=" + employeesId
                + ", name='" + employees_Name + '\''
                + "idCode=" + idCode
                + '}';
    }
    
    //тэги для отношения с Docs
/*
    mapping one-to-many (master-detail). главная (master) - Employees, подчиненная (detail) - DocsEntity
    в главной создается коллекция с элементами подчиненной таблицы, и указывается имя свойства в классе для подчиненной
    таблицы
    */
    @OneToMany(mappedBy = "employees")//employees - это свойство  в классе DocsEntity.
                                      //Свойство DocsEntity описано там при помощи тэгов @ManyToOne и @JoinColumn
    private List<DocsEntity> docs;
    public List<DocsEntity> getDocs() {
        return docs;
    }
    public void setDocs(List<DocsEntity> docs) {
        this.docs = docs;
    }

}

