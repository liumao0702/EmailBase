package com.email.base.web.index;

import com.email.base.web.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2015/7/21.
 */
@Controller
public class EmailAdmin extends BaseController {

    private static Logger logger = LoggerFactory.getLogger(EmailAdmin.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap model) {
        return "redirect:/signIn";
    }

    @RequestMapping(value = "/signIn", method = RequestMethod.GET)
    public String signIn(ModelMap model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam(value="name", required=true) String name,
            @RequestParam(value="passwd", required=true) String passwd,
            ModelMap model) {
        logger.info("########### login request #############");
        boolean ret = admin.login(name,passwd);
        if(ret){
            return "index";
        }
        return "login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap model) {
        return "index";
    }

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
