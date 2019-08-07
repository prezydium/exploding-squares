package com.presidium.explodingsquares.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeScreenController {

    public ModelAndView welcomeScreen() {
        return new ModelAndView("welcome");
    }

}
