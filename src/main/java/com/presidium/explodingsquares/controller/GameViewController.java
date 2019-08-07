package com.presidium.explodingsquares.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameViewController {

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView basicGameView() {
        return new ModelAndView("game");
    }
}
