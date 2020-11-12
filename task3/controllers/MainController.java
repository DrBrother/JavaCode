package task3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import task3.UnauthorizedDeliveries;
import task3.models.Logins;
import task3.models.Posting;
import task3.repo.LoginsRepository;
import task3.repo.PostingRepository;

@Controller
public class MainController {


    @Autowired
    private PostingRepository postingRepository;

    @GetMapping("/home")
    public String greeting(Model model) {

        Iterable<Posting> postings = postingRepository.findAll();
        model.addAttribute("postings", postings);
        return "home";
    }



}