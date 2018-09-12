package servicio;

import modelo.Conexion;
import modelo.PreguntaAll;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jesus_000 on 2/10/2017.
 */
public class ServicioPregunta implements Serializable {

    private Connection connection;

    public ServicioPregunta() {
        connection = Conexion.getConnection();
    }

    public List<PreguntaAll> getListaPreguntas() throws SQLException {
        List<PreguntaAll> list = new ArrayList<PreguntaAll>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM formulario.preguntaall");
        while (resultSet.next()) {
            PreguntaAll preguntaAll = new PreguntaAll();
            preguntaAll.setIdpregunta(resultSet.getInt("idpregunta"));
            preguntaAll.setContenido(resultSet.getString("contenido"));
            preguntaAll.setIdtipo_pregunta(resultSet.getInt("idtipo_pregunta"));
            preguntaAll.setDescripcion(resultSet.getString("descripcion"));
            list.add(preguntaAll);
        }
        return list;
    }
}
