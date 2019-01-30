package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;



@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
        // not works
        //Test(args);

	}

    //TODO:Поставить драйвер postgres на сервер?
    public static final String SELECT_QUERY = "SELECT * FROM PEOPLE";
	public static void Test(String[] args) {
		String host = "jdbc:postgresql://35.190.193.191:5432/postgres";
		String uName = "postgres";
		String uPass = "Passw0rd!";

        //there is no suitable driver exception
        try (Connection conn = DriverManager.getConnection(host, uName, uPass);
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(SELECT_QUERY)) {

			while (rs.next()) {
 				int id = rs.getInt("id");
				String somePropertyValue = rs.getString(id);
                 System.out.print("\nSmoke success\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

