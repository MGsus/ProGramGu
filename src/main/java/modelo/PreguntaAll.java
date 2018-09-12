package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by jesus_000 on 14/10/2017.
 */
@Entity
public class PreguntaAll implements Serializable {

    @Id
    @Column
    private int idpregunta;

    @Column
    private String contenido;

    @Column
    private int idtipo_pregunta;

    @Column
    private String descripcion;

    public int getIdpregunta() {
        return idpregunta;
    }

    public void setIdpregunta(int idpregunta) {
        this.idpregunta = idpregunta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getIdtipo_pregunta() {
        return idtipo_pregunta;
    }

    public void setIdtipo_pregunta(int idtipo_pregunta) {
        this.idtipo_pregunta = idtipo_pregunta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "idpregunta:" + idpregunta +
                ", contenido:'" + contenido +
                ", idtipo_pregunta:" + idtipo_pregunta +
                ", descripcion:'" + descripcion;
    }
}
