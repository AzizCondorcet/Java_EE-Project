package be.project.dao;

import be.project.pojo.Site;
import be.project.singleton.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SiteDAO {

    public Site getSiteById(int id) {
        String sql = "SELECT * FROM Site WHERE id_site = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id); // Remplacer le "?" par l'ID
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                String city = resultSet.getString("City");
                return new Site(city, id); // j'ai creé un constructeur commme je sais c pas bon c juste pour test
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retourner null si aucune donnée n'est trouvée
    }
}
