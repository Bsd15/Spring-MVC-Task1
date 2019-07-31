package com.stackroute.sprinmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller to handle main page and form request
 */
@Controller
public class HomeController {
    /**
     * Index mapping.
     * @return index.jsp
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    /**
     * Redirect from main page to display username.
     * @return greetUser.jsp
     */
    @RequestMapping("/greetUser")
    public String greetUser() {
        return "greetUser";
    }
}
