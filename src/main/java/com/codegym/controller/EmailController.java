package com.codegym.controller;

import com.codegym.model.MailBox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class EmailController {
    List<String> languages;
    List<Integer> pageSizes;

    @GetMapping()
    public String home(){
        return "index";
    }

    @GetMapping("/setting")
    public String setting(Model model){
         languages = new ArrayList<>();
         languages.add("English");
         languages.add("Vietnamese");
         languages.add("Japan");
         languages.add("Chinese");

         pageSizes = new ArrayList<>();
         pageSizes.add(5);
         pageSizes.add(10);
         pageSizes.add(15);
         pageSizes.add(25);
         pageSizes.add(50);
         pageSizes.add(100);
         model.addAttribute("languages", languages);
         model.addAttribute("pagesizes", pageSizes);
         model.addAttribute("mailbox", new MailBox());
        return "setting";
    }

    @PostMapping("/setting")
    public String getInfo(){
        return null;
    }
}
