package database;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args)  {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String user = Credentials.USER;
        String password = Credentials.PASSWORD;
        String schema = Credentials.DB;

        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");

            // Setup the connection with the DB
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/" + schema + "?"
                            + "user=" + user + "&password=" + password + "&useSSL=false");

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("select * from users");

            // loop through the result set while there are more records
            while (resultSet.next()) {

                // get the id, name and units fields from the result set and assign them to local variables
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");

                // print out the result
                System.out.println("User ID: " + id + " is " + name + " and email is " + email);
            }

        } catch (SQLException exc) {
            System.out.println("Exception occurred");
            exc.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occured - driver not found on classpath");
            e.printStackTrace();
        } finally {
            try {
                // close all JDBC elements
                statement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



}
