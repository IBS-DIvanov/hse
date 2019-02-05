package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import com.example.demo.*;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
         Test(args);

	}

    //TODO:Поставить драйвер postgres?
	public static final Integer countOfRows = 10;
	//takes limited count of rows in database, or all if counter = 0;
    public static final String SELECT_QUERY = countOfRows==0? "SELECT * FROM PEOPLE":"SELECT * FROM PEOPLE LIMIT "+countOfRows;
	public static void Test(String[] args) {
		String host = "jdbc:postgresql://35.190.193.191:5432/postgres";
		String uName = "postgres";
		String uPass = "Passw0rd!";
        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {


            e.printStackTrace();
            return;

        }
        //there is no suitable driver exception
        try (Connection conn = DriverManager.getConnection(host, uName, uPass);
			 Statement stmt = conn.createStatement();
			 ResultSet rs = stmt.executeQuery(SELECT_QUERY)) {
			int columns = rs.getMetaData().getColumnCount();
			while(rs.next()){
				for (int i = 1; i <= columns; i++){
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

