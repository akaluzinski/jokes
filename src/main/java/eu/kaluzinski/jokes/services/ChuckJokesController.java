package eu.kaluzinski.jokes.services;

import eu.kaluzinski.jokes.service.ChuckNorrisQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckJokesController {
    private ChuckNorrisQuotesService chuckNorrisQuotesService;

    public ChuckJokesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @RequestMapping("/joke")
    public String getChuckJoke(Model model) {
        model.addAttribute("joke", chuckNorrisQuotesService.getQuote());
        return "joke";
    }

}
