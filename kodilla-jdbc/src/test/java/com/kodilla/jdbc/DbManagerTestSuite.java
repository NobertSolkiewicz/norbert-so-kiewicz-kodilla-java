package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnetion());

    }

    @Test
    void testSelectusers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnetion().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
            rs.getString("FIRSTNAME") + ", " +
            rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = """
                SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER
                FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID
                GROUP BY P.USER_ID
                HAVING COUNT(*) >= 2
                """;
        Statement statement = dbManager.getConnetion().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
            rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(1, counter);

    }
}
