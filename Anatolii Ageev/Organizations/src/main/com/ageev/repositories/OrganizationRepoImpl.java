package main.com.ageev.repositories;

import main.com.ageev.domain.Organization;
import main.com.ageev.domain.Regions;

import java.sql.*;
import java.util.ArrayList;

public class OrganizationRepoImpl {
    public ArrayList<Organization> getAll(){

        ArrayList<Organization> organizations = new ArrayList<Organization>();
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("класс sqlite.JDBC не найден в файле sqlite-jdbc-3.8.11.2.jar");
        }

        Connection connection = null;
        try {
            java.util.Locale locale = java.util.Locale.getDefault();
            java.util.Locale.setDefault(java.util.Locale.ENGLISH);
            connection = DriverManager.getConnection(
                    "jdbc:sqlite:D:\\javaGitTest\\ckj09\\Anatolii Ageev\\orcl\\organizations.db");
            java.util.Locale.setDefault(locale);
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT ID, " +
                    "NAME, " +
                    "PHONE_NUMBER, " +
                    "ADRESS, " +
                    "REGION, " +
                    "COUNTRY, " +
                    "CITY, " +
                    "ACTIVE, " +
                    "SPECIALIZATION " +
                    "FROM ORGANIZATIONS");

            while (rs.next()) {
                Long ID = rs.getLong("ID");
                String name = rs.getString("NAME");
                String phoneNumber = rs.getString("PHONE_NUMBER");
                String adress = rs.getString("ADRESS");
                String country = rs.getString("COUNTRY");
                String city = rs.getString("CITY");
                Boolean isActiv = rs.getBoolean("ACTIVE");
                String specialization = rs.getString("SPECIALIZATION");
                Organization org = new Organization(ID, name,phoneNumber,adress,country,city,isActiv, specialization);
                organizations.add(org);

            }
        } catch (SQLException ex) {
            System.out.println("Или серевер не доступен, или пользователь не существует, или пароль не подходит");
            System.out.printf("подробнее об ошибке %s", ex.toString());
        }
        return organizations;

    }
}
