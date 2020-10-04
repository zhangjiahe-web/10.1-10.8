package com.kgc.zhang.controller;

import com.kgc.zhang.entity.studentinfo;
import com.kgc.zhang.service.studentinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class studentinfoController {
    @Resource
    studentinfoService studentinfoService;
    @RequestMapping("index")
    public  String doindex(Model model){
        List<studentinfo> students = studentinfoService.selectByExample(null);
        model.addAttribute("students",students);
        return "index";

    }
    @RequestMapping("updatecha")
    public  String updatecha(Model model,Integer sid){
        studentinfo studentinfo = studentinfoService.selectByPrimaryKey(sid);
        model.addAttribute("list",studentinfo);
        return "update";

    }
    @RequestMapping("updateinfo")
    public  String updateinfo(studentinfo studentinfo){
        int i = studentinfoService.updateByPrimaryKeySelective(studentinfo);
if (i>0) {
    return "redirect:index";
}else {
    return "redirect:index";
}
    }
}
