package com.ccg.coreccg.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = {"", "/"}, method = RequestMethod.GET)
    public String getMainPage(Model modal) {
        return "main";
    }

    @RequestMapping(value = {"/export"}, method = RequestMethod.GET)
    public String getExportPage() {
        return "export";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

}
