package servicio;

import modelo.Conexion;
import modelo.Programa;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServicioPrograma implements Serializable {

    private Connection connection;

    public ServicioPrograma() {
        this.connection = Conexion.getConnection();
    }

    public Programa getProgramaById(int id) throws SQLException {
        Programa programa = new Programa();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM programas WHERE idprograma=?");
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            programa.setIdprograma(resultSet.getInt("idprograma"));
            programa.setNombre(resultSet.getString("nombre"));
            programa.setLink(resultSet.getString("link"));
        }
        return programa;
    }
}
