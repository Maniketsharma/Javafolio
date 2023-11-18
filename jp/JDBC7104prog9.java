import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class prog9{
/*Create a Java Program to show, insert, update,
 delete of the table in Java API through 
PreparedStatement. */

    private static final String JDBC_URL = "jdbc:loacalhost:3306/maniket7104","root","maniket@1234";

    public static void main(String[] args) {
        try (Connection c = DriverManager.getConnection(JDBC_URL)) {
            System.out.println("Connected to the database.");

            createTable(connection);

            insertData(c, 1, "Saurav", 20);

            displayData(connection);

            updateData(c, 1, "Saurav", 30);

            displayData(connection);

            deleteData(c, 1);

            displayData(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection c) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS persons (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)";
        try (PreparedStatement st = connection.prepareStatement(createTableSQL)) {
            st.executeUpdate();
            System.out.println("Table created successfully.");
        }
    }

    private static void insertData(Connection connection, int id, String name, int age) throws SQLException {
        String insertDataSQL = "INSERT INTO persons (id, name, age) VALUES (?, ?, ?)";
        try (PreparedStatement st = connection.prepareStatement(insertDataSQL)) {
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, age);
            st.executeUpdate();
            System.out.println("Data inserted successfully.");
        }
    }

    private static void displayData(Connection connection) throws SQLException {
        String selectDataSQL = "SELECT * FROM student";
        try (PreparedStatement statement = connection.prepareStatement(selectDataSQL);
             ResultSet resultSet = statement.executeQuery()) {

            System.out.println("ID\tName\tAge");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" +
                        resultSet.getString("name") + "\t" +
                        resultSet.getInt("age"));
            }
        }
    }

    private static void updateData(Connection connection, int id, String newName, int newAge) throws SQLException {
        String updateDataSQL = "UPDATE persons SET name = ?, age = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateDataSQL)) {
            st.setString(1, newName);
            st.setInt(2, newAge);
            st.setInt(3, id);
            st.executeUpdate();
            System.out.println("Data updated successfully.");
        }
    }

    private static void deleteData(Connection connection, int id) throws SQLException {
        String deleteDataSQL = "DELETE FROM persons WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteDataSQL)) {
            st.setInt(1, id);
            st.executeUpdate();
            System.out.println("Data deleted successfully.");
        }
    }
}
