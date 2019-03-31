package org.feally.sparrow.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping({ "/", "/index" })
    @ResponseBody
    public String doIndex() {
        return "x";
    }

}
