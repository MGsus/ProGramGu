package modelo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "programas")
public class Programa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprograma")
    int idprograma;

    @Column(name = "nombre")
    String nombre;

    @Column(name = "link")
    String link;


    public int getIdprograma() {
        return idprograma;
    }

    public void setIdprograma(int idprograma) {
        this.idprograma = idprograma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }



    @Override
    public String toString() {
        return "idprograma:" + idprograma +
                ", nombre:'" + nombre +
                ", link:'" + link;
    }
}
