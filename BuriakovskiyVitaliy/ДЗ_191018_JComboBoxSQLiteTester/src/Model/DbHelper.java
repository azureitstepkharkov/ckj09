package Model;

import java.sql.DriverManager;//управление версиями драйевров
import java.sql.Connection;//механизмы соединения БД
import java.sql.Statement;//для запросов select (update)
import java.sql.CallableStatement;//для работы с ХП
import java.sql.ResultSet;//хранилище результата выборки
//select

import java.util.Date;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

public class DbHelper {

    public Vector<WagonCar> getWagonCar() {
        Vector<WagonCar> v = new Vector<WagonCar>();
        //Шаг 1 Подключить драйвер +
        //Шаг 2 Зарегистировать нужный
        //класс драйвера
        System.out.println("-------- Oracle JDBC Connection Testing ------");
        try {
            Class.forName("org.sqlite.JDBC");

            //Шаг 3 настроить соединение
            Connection connection = null;

            connection = DriverManager.getConnection(
                    "jdbc:sqlite:E:\\ckj9\\BuriakovskiyVitaliy\\ДЗ_191018_JComboBoxSQLiteTester\\Cars.db");
            Statement stm = connection.createStatement();
            ResultSet rs = stm.executeQuery("SELECT \n"
                    + "  CR.CAR_STARTED\n"
                    + ", CR.DRIVER_IN_CAR\n"
                    + ", CRG.BODY_VOLUME\n"
                    + ", CRG.CARRYING\n"
                    + ", WGN.FASTENING_S_\n"
                    + ", WGN.LOADER_SYSTEM_WORKS\n"
                    + "FROM CAR CR\n"
                    + "LEFT JOIN CARGO_CAR CRG ON  CR.ID = CRG.CAR_ID\n"
                    + "LEFT JOIN WAGON_CAR WGN ON CRG.ID = WGN.CARGO_CAR_ID\n"
                    + "WHERE CRG.ID IS NOT NULL AND WGN.ID IS NOT NULL");

            while (rs.next()) {
                boolean fasteningSystem = (rs.getString("FASTENING_S_").equals('Y')? true: false);
                boolean loaderSystemWorks = (rs.getString("LOADER_SYSTEM_WORKS").equals('Y')? true: false);
                int carrying =  rs.getInt("CARRYING");
                int bodyVolume =  rs.getInt("BODY_VOLUME");
                boolean driverInCar = (rs.getString("DRIVER_IN_CAR").equals('Y')? true: false);
                boolean carStarted = (rs.getString("CAR_STARTED").equals('Y')? true: false);
                String result = ""+fasteningSystem + loaderSystemWorks + carrying + bodyVolume + driverInCar + carStarted;
                System.out.println(result);
                
                WagonCar wCar = new WagonCar(fasteningSystem,
                         loaderSystemWorks,
                         carrying,
                         bodyVolume,
                         driverInCar,
                         carStarted);
                //
                v.add(wCar);
            }

            
        } catch (ClassNotFoundException ex) {
            System.out.println("класс org.sqlite.JDBC не найден в файле sqlite-jdbc-3.8.11.2.jar");
            //  return v;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return v;
    }

      
}
