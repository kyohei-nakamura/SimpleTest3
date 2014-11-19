package org.sample.springmvc.extra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleTest {
    @RequestMapping("/welcome")
    public String execute() {
        return "welcome";
    }
}