package com.yw.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author a1387537
 */

@Controller
public class IndexController {
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index (Model model){
        return "index";
    }

    @RequestMapping(value = "index2",method = RequestMethod.GET)
    public String index2(){
        return "index2";
    }
    @RequestMapping(value = "index3",method = RequestMethod.GET)
    public String index3(){
        return "index3";
    }
}
