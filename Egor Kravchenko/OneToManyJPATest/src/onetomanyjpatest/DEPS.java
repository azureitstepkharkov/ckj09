
package onetomanyjpatest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //!! 
@Table(name = "DEPS") 
public class DEPS {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "ID", unique = true, nullable = false) 
    private int id;
    
    @Column(name = "NAME", unique = false, nullable = false, length = 50)
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "d_id")//имя столбца-родителя-мастера в этой таблице
    private USRS users;

    public USRS getUsers() {
        return users;
    }

    public void setUsers(USRS users) {
        this.users = users;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DEPS() {
    }

    public DEPS(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DEPS{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
