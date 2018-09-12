package controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public RedirectView printWelcome() {
        return new RedirectView("/home");
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "hello";
    }
}