package com.lessons.controllers;

import com.lessons.services.DashboardDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller("com.lessons.controllers.WelcomeController")
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);


    /**********************************************************************
     * showDefaultPage()
     ***********************************************************************/
    @RequestMapping("/")
    public String showDefaultPage()
    {
        logger.debug("showDefaultPage() started");

        // Forward the user to the main page
        return "forward:/app.html";
    }

    /**********************************************************************
     * showSample1()
     ***********************************************************************/
    @RequestMapping("/sample1")
    public String showSample1()
    {
        logger.debug("showSample1() started");

        // Forward the user to the main page
        return "forward:/sample1.html";
    }

    /**********************************************************************
     * showSample2()
     ***********************************************************************/
    @RequestMapping("/sample2")
    public String showSample2()
    {
        logger.debug("showSample2() started");

        // Forward the user to the main page
        return "forward:/sample2.html";
    }

    /**********************************************************************
     * showSample3()
     ***********************************************************************/
    @RequestMapping("/sample3")
    public String showSample3()
    {
        logger.debug("showSample3() started");

        // Forward the user to the main page
        return "forward:/sample3.html";
    }
}
