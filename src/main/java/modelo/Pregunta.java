package modelo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by jesus_000 on 2/10/2017.
 */
@Entity
@Table(name = "preguntas")
public class Pregunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpregunta")
    private int idpregunta;

    @Column(name = "contenido")
    private String contenido;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idtipo_pregunta")
    private TipoPregunta tipoPregunta;

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

    public TipoPregunta getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(TipoPregunta tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    @Override
    public String toString() {
        return "idpregunta=" + idpregunta + ", contenido=" + contenido;
    }
}
