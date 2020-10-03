package com.kgc.zhang.controller;

import com.kgc.zhang.entity.Person;
import com.kgc.zhang.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PersonController {
    @Resource
    PersonService personService;
    @RequestMapping("index")
    public  String doindex(Model model){
        List<Person> people = personService.selectByExample(null);
        model.addAttribute("people",people);
        return "index";

    }
    @RequestMapping("delete")
    public  String delete(Model model,Integer id){
        int i = personService.deleteByPrimaryKey(id);
        if (i>0){  return "redirect:index";}
        return "redirect:index";
    }
    @RequestMapping("doadd")
    public  String doadd(Person person,Model model){
        int i = personService.insert(person);
        if (i>0){
            model.addAttribute("suc","suc");
            return "redirect:index";}
        return "redirect:index";
    }
}
