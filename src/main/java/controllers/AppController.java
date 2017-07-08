package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class AppController {

    @RequestMapping(value = "index1", method = RequestMethod.GET)
    public String helloWorld() {
        return "index";
    }
}
