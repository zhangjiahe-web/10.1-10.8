package com.kgc.zhang.controller;

import com.kgc.zhang.entity.Bills;
import com.kgc.zhang.entity.BillsExample;
import com.kgc.zhang.service.billsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class billsController {
    @Resource
    billsService billsService;
    @RequestMapping("index")
    public  String toindex(Model model, Integer typeId, Date stratbillTime, Date endbillTime){
        BillsExample example=new BillsExample();
        BillsExample.Criteria criteria = example.createCriteria();
        if (typeId!=null&&typeId!=0){
            criteria.andTypeIdEqualTo(typeId);
        }
if (stratbillTime!=null&&endbillTime==null){
            criteria.andBillTimeEqualTo(stratbillTime);
}
        if (stratbillTime==null&&endbillTime!=null){
            criteria.andBillTimeEqualTo(endbillTime);
        }
        if (stratbillTime!=null&&endbillTime!=null){
            criteria.andBillTimeBetween(stratbillTime,endbillTime);
        }
        List<Bills> bills = billsService.selectByExample2(example);

        model.addAttribute("bills",bills);
        return "index";
    }


    @RequestMapping("doadd")
    public  String doadd(Bills bills){
        int insert = billsService.insert(bills);
        if (insert>0){
            return "redirect:index";
        }else {
            return "";
        }

    }
}
