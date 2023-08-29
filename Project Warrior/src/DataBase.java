import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.io.FileInputStream;

public class DataBase {
    private static String CONFIG_FILE = ".env";

    public static List<Characters> getHeroes() {
        List<Characters> heroes = new ArrayList<>();

        try  {
            Properties properties = new Properties();
            properties.load (new FileInputStream(".env"));

            String url = "jdbc:mysql://localhost:3306/heroes";
            String username = properties.getProperty("heroes.username");
            String password = properties.getProperty("heroes.password");
            Connection connection = DriverManager.getConnection(url, username, password);
            try  {
                String query = "SELECT type, name, strength, life FROM hero";

                try (PreparedStatement statement = connection.prepareStatement(query);
                     ResultSet resultSet = statement.executeQuery()) {

                    while (resultSet.next()) {
                        String type = resultSet.getString("type");
                        String name = resultSet.getString("name");
                        int strength = resultSet.getInt("strength");
                        int life = resultSet.getInt("life");

                        if ("warrior".equals(type)) {
                            Warrior warrior = new Warrior(name, strength, life);
                            heroes.add(warrior);
                        } else if ("magician".equals(type)) {
                            Magician magician = new Magician(name, strength, life);
                            heroes.add(magician);
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return heroes;
    }
}
