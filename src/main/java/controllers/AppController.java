package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "", produces = {"text/html"})
public class AppController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello, Cactus!";
    }
}
