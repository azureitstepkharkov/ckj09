package javareflectiontest;

public class MyUser 
{

    public MyUser(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
        System.out.println("call MyUser(Long id...");
    
    }

    public MyUser() 
    {
       System.out.println("call MyUser()");
    }

    @Override
    public String toString() {
        System.out.println("call toString()");
        return "MyUser{" + "id=" + id + ", email=" + email + ", password=" + password + '}';
    }

    public Long getId() {
        System.out.println("call getId()");
        return id;
    }

    public void setId(Long id) {
        System.out.println("call setId(");
        this.id = id;
    }

    public String getEmail() {
        System.out.println("call getEmail()");
        return email;
    }

    public void setEmail(String email) {
        System.out.println("call setEmail(");
        this.email = email;
    }

    public String getPassword() {
        System.out.println("call getPassword()");
        return password;
    }

    public void setPassword(String password) {
        System.out.println("call setPassword(");
        this.password = password;
    }
    private Long id;
    private String email;
    private String password;
    
}
