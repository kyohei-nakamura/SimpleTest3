package org.sample.springmvc.extra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleTest {
    @Autowired
    MessageBean mb;

    @RequestMapping("/welcome")
    public ModelAndView execute() {
        ModelAndView mav = new ModelAndView("welcome");
        mav.addObject("messageBean", mb);
        return mav;
    }

    @RequestMapping("/input")
    public ModelAndView input() {
        ModelAndView mav = new ModelAndView("input");
        mav.addObject("messageBean", mb);
        return mav;
    }

    @RequestMapping("/output")
    public ModelAndView output(@ModelAttribute("messageBean") MessageBean bean) {
        ModelAndView mav = new ModelAndView("output");
        System.out.println("Before mb.getMessage() : " + mb.getMessage());
        System.out.println("Before bean.getMessage() : " + bean.getMessage());
        System.out.println("mb.setMessage(bean.getMessage());");
        mb.setMessage(bean.getMessage());
        System.out.println("After mb.getMessage() : " + mb.getMessage());
        System.out.println("After bean.getMessage() : " + bean.getMessage());
        mav.addObject("messageBean", mb);
        return mav;
    }
}