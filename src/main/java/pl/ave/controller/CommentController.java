package pl.ave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.ave.data.CommentRepository;
import pl.ave.model.Comment;

import java.util.List;

@Controller
public class CommentController {

    private CommentRepository commentRepository;

    @Autowired
    public CommentController(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @PostMapping("/save")
    public String saveComment(@ModelAttribute Comment comment){
        commentRepository.save(comment);
        return "redirect:/";
    }

    @GetMapping("/show")
    public String showAll(Model model) {
        List<Comment> allComments = commentRepository.findAll();
        model.addAttribute("allComments", allComments);
        return "showall";
    }
}
