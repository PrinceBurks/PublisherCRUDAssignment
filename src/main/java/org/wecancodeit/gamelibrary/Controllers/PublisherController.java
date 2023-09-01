package org.wecancodeit.gamelibrary.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.gamelibrary.Repos.PublisherRepo;

import jakarta.annotation.Resource;

@Controller
public class PublisherController {

    @Resource
    private PublisherRepo repo;

    public PublisherController(PublisherRepo repo) {
        this.repo = repo;
    }

    @GetMapping({"", "/", "/publisher"})
    public String getAllPublishers(Model model){
        model.addAttribute("publishers", repo.findAll());
        return "displayPublishersView";
        
    }

    @GetMapping("/publisher/gameDetails/{id}")
    public String getPublisherDetails(@PathVariable Long id, Model model){
        model.addAttribute("publisher", repo.findById(id).get());
        return "gameDetailsView";


    }

    @GetMapping("/publisher/deletePublisher/{id}")
    public String deletePublisher(@PathVariable Long id, Model model){
        
        
            repo.deleteById(id);
        
        return "redirect:/publisher";
}

@GetMapping({"/publisher/editPublishers"})
    public String displayEditPub(Model model){
        model.addAttribute("publishers", repo.findAll());
        return "editPublishersView";
        
    }
}
