package eu.kaluzinski.jokes.services;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    @RequestMapping("/joke")
    public String getJoke(Model model){
        model.addAttribute("jokes", "test");
        return "joke";
    }

}
