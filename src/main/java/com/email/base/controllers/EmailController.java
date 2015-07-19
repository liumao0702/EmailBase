package com.email.base.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/7/18.
 */
@Controller
public class EmailController {
    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String dashboard(ModelMap model) {
        return "email/dashboard";
    }

    @RequestMapping(value = "/sendBox", method = RequestMethod.GET)
    public String sendBox(ModelMap model) {
        return "email/sendBox";
    }

    @RequestMapping(value = "/inBox", method = RequestMethod.GET)
    public String inBox(ModelMap model) {
        return "email/inBox";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(ModelMap model) {
        return "email/contact";
    }
}
