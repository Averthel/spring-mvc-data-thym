package pl.ave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.ave.model.Comment;

@Controller
public class HomeController {

    @GetMapping
    public String home(Model model){
        model.addAttribute("commentContent", new Comment());
        return "index";
    }
}
