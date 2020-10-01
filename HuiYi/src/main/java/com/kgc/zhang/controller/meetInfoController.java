package com.kgc.zhang.controller;

import com.kgc.zhang.entity.meetinfgroom;
import com.kgc.zhang.service.meetInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class meetInfoController {
    @Resource
    meetInfoService meetInfoService;
    @RequestMapping("index")
    public  String toindex(Model model){
        List<meetinfgroom> meetinfgrooms = meetInfoService.selectByExample(null);
        model.addAttribute("meetinfgrooms",meetinfgrooms);
        return "index";

    }
    @RequestMapping("doadd")
    public  String toadd(Model model,meetinfgroom meetinfgroom){
        int insert = meetInfoService.insert(meetinfgroom);
        if (insert>0){
            model.addAttribute("suc","suc");
            return "add";
        }else {
            return "redirect:index";
        }


    }

}
