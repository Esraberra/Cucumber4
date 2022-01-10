package step_definitions;

import utilities.DatabaseUtility;

import java.sql.*;

public class DatabaseTest extends DatabaseUtility {



    public static void main(String[] args) throws SQLException {
connection();
//createConnection();

//reading datas
     //   String query="select * from tp_customer";
      //  System.out.println(getColumnNames(query));



    }


    public static void connection() throws SQLException {
        String url="jdbc:postgresql://157.230.48.97:5432/gmibank_db";
        String user="techprodb_user";
        String password="Techpro_@126";
        Connection connection;
        Statement statement;
        ResultSet resultSet;
        connection= DriverManager.getConnection(url,user,password);
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String query="select * from tp_customer";
        resultSet=statement.executeQuery(query);
        System.out.println(resultSet.toString());
    }
}
