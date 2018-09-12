package servicio;

import modelo.Conexion;
import modelo.Respuesta;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServicioRespuesta implements Serializable {

    private Connection connection;

    public ServicioRespuesta() {
        this.connection = Conexion.getConnection();
    }

    public Respuesta getRespuestaPorId(int id) throws SQLException {
        Respuesta respuesta = new Respuesta();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM respuestas WHERE idrespuestas = ?");
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            respuesta.setIdrespuestas(rs.getInt("idrespuestas"));
            respuesta.setIdpregunta(rs.getInt("idpregunta"));
            respuesta.setContenido(rs.getString("contenido"));
            respuesta.setIdprograma(rs.getInt("idprograma"));
        }
        return respuesta;
    }

    public List<Respuesta> getListaRespuestas() throws SQLException {
        List<Respuesta> respuestaList = new ArrayList<Respuesta>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM respuestas");
        while (resultSet.next()) {
            Respuesta respuesta = new Respuesta();
            respuesta.setIdrespuestas(resultSet.getInt("idrespuestas"));
            respuesta.setIdpregunta(resultSet.getInt("idpregunta"));
            respuesta.setContenido(resultSet.getString("contenido"));
            respuesta.setIdprograma(resultSet.getInt("idprograma"));
            respuestaList.add(respuesta);
        }
        return respuestaList;
    }

    public String getContenidoById(int id) throws SQLException {
        String sql = "SELECT contenido FROM respuestas WHERE idrespuestas =" + id;
        String res = "";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next())
            res = resultSet.getString("contenido");
        return res;
    }
}
