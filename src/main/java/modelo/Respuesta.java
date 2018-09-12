package modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "respuestas")
public class Respuesta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idrespuestas")
    int idrespuestas;

    @Column(name = "idpregunta")
    int idpregunta;

    @Column(name = "contenido")
    String contenido;

    @Column(name = "idprograma")
    int idprograma;



    public Respuesta() {
    }

    public Respuesta(int idpregunta, String contenido, int idprograma) {
        this.idpregunta = idpregunta;
        this.contenido = contenido;
        this.idprograma = idprograma;
    }

    public int getIdrespuestas() {
        return idrespuestas;
    }

    public void setIdrespuestas(int idrespuestas) {
        this.idrespuestas = idrespuestas;
    }

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

    public int getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(int idprograma) {
        this.idprograma = idprograma;
    }

    @Override
    public String toString() {
        return "idrespuestas=" + idrespuestas +
                ", idpregunta=" + idpregunta +
                ", contenido='" + contenido +
                ", idprograma='" + idprograma;
    }
}
