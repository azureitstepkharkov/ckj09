
package onetomanyjpatest;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //!! 
@Table(name = "USRS") 
public class USRS {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "ID", unique = true, nullable = false) 
    private int id;
    
    @Column(name = "NAME", unique = false, nullable = false, length = 50)
    private String name;
    
    @Column(name = "d_id", unique = false, nullable = false)
    private int d_id;
    
   @OneToMany(mappedBy = "users")
    private List<DEPS> deps;

    public List<DEPS> getDeps() {
        return deps;
    }

    public void setDeps(List<DEPS> deps) {
        this.deps = deps;
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

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public USRS() {
    }

    public USRS(String name, int d_id) {
        this.name = name;
        this.d_id = d_id;
    }

    @Override
    public String toString() {
        return "USRS{" + "id=" + id + ", name=" + name + ", d_id=" + d_id + '}';
    }
    
    
    
    
}
