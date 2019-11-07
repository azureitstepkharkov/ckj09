package com.ageev;

public class MyUser {
   private String password;
   private String email;
   private Long Id;

    public MyUser(String password, String email, Long id) {
        System.out.println("Constractor");
        this.password = password;
        this.email = email;
        Id = id;
    }

    public MyUser() {
        System.out.println("Constractor by defolt");
    }

    public String getPassword() {
        System.out.println("getPassword");
        return password;
    }

    public void setPassword(String password) {
        System.out.println("setPassword");
        this.password = password;
    }

    public String getEmail() {
        System.out.println("getEmail");
        return email;
    }

    public void setEmail(String email) {
        System.out.println("setEmail");
        this.email = email;
    }

    public Long getId() {
        System.out.println("getId");
        return Id;
    }

    public void setId(Long id) {
        System.out.println("setId");
        Id = id;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", Id=" + Id +
                '}';
    }
}
