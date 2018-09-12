package controlador;


import modelo.Programa;
import modelo.Respuesta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import servicio.ServicioPregunta;
import servicio.ServicioPrograma;
import servicio.ServicioRespuesta;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
public class FormularioControlador implements Serializable {
    ServicioPregunta servicioPregunta = new ServicioPregunta();
    ServicioPrograma servicioPrograma = new ServicioPrograma();
    ServicioRespuesta servicioRespuesta = new ServicioRespuesta();
    Respuesta respuesta = new Respuesta();

    @RequestMapping(value = "/formulario", method = RequestMethod.GET)
    public String showForm(Model modelMap) throws SQLException {
        modelMap.addAttribute("respuestasCliente", respuesta);
        modelMap.addAttribute("listaPreguntas", servicioPregunta.getListaPreguntas());
        return "Formulario";
    }

    @RequestMapping(value = "/respuesta", method = RequestMethod.POST)
    public String showAns(@RequestParam List<String> idrespuesta, @RequestParam List<String> contenido, Model model) throws SQLException {
        List<Programa> programas = new ArrayList<Programa>();
        for (int i = 0; i < idrespuesta.size(); i++) {
            System.out.print(idrespuesta.get(i) + " " + contenido.get(i) + " ");
            if (servicioRespuesta.getContenidoById(Integer.parseInt(idrespuesta.get(i))).equals(contenido.get(i))) {
                programas.add(servicioPrograma.getProgramaById(servicioRespuesta.getRespuestaPorId(Integer.parseInt(idrespuesta
                        .get(i))).getIdprograma()));
            }
        }
        for (Programa programa : programas) {
            System.out.println(programa.getNombre());
        }
        programas.sort(Comparator.comparing(Programa::getIdprograma));
        model.addAttribute(programas);
        return "Resultado";
    }
}
