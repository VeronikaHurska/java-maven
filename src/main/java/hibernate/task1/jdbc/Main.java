package hibernate.task1.jdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "veronika", "3828");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            PreparedStatement statement = connection.prepareStatement("select * from  actor");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        connection.close();
    }

}
