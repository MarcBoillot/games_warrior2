import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DataBase {
   public static void getHeroes() {
        String url = "jdbc:mysql://localhost:3306/heroes";
        String username = "boillot";
        String password = "1234";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT type, name, strength, life FROM hero";

            try (PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    String type = resultSet.getString("type");
                    String name = resultSet.getString("name");
                    int strength = resultSet.getInt("strength");
                    int life = resultSet.getInt("life");

                    System.out.println("Type: " + type);
                    System.out.println("Nom: " + name);
                    System.out.println("Force: " + strength);
                    System.out.println("Vie: " + life);
                    System.out.println("------------------------");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

