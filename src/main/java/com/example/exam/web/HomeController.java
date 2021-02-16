package com.example.exam.web;

import com.example.exam.security.CurrentUser;
import com.example.exam.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final CurrentUser currentUser;
    private final ItemService itemService;

    public HomeController(CurrentUser currentUser, ItemService itemService) {
        this.currentUser = currentUser;
        this.itemService = itemService;
    }


    @GetMapping("/")
    public String home(Model model){
        if (currentUser.isAnonymous()){
            return "index";
        }

        model.addAttribute("items",this.itemService.findAllItems());
        model.addAttribute("count",this.itemService.findAllItems().size());
        return "home";
    }
}
