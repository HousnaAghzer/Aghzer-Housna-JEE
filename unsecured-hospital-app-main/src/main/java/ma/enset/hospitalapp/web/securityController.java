package ma.enset.hospitalapp.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class securityController {
    @GetMapping("/notAuthorized") // Il sera affiché si vous n'avez pas accès à une ressource
    public String notAuthorized(){

        return "notAuthorized";
    }

    @GetMapping("/login") // La page d'authentification
    public String login(){

        return "login";
    }
}
