package org.csu.petstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class democontroller {
    @GetMapping("/demo")
    @ResponseBody
    public String demo(){
        return "原神启动！";
    }
    @GetMapping("demo1")
    public String demo1(Model model){
        model.addAttribute("message" , "你启动了吗");
        return "demo1";
    }
}
