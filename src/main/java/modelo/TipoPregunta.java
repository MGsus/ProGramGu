package modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tipo_preguntas")
public class TipoPregunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipo_pregunta")
    private int idtipo_pregunta;

    @Column(name = "descripcion")
    private String descripcion;

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
        return "idtipo_pregunta:" + idtipo_pregunta +
                ", descripcion:" + descripcion;
    }
}
