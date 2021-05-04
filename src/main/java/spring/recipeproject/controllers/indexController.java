package spring.recipeproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // makes Spring bean
public class indexController {

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }

}
