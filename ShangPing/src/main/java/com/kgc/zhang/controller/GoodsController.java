package com.kgc.zhang.controller;

import com.kgc.zhang.entity.Goods;
import com.kgc.zhang.entity.GoodsExample;
import com.kgc.zhang.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GoodsController {
    @Resource
    GoodsService goodsService;
    @RequestMapping("index")
    public  String index(Model model, Integer goodsdistrict, HttpSession session){
        GoodsExample example=new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        session.setAttribute("goodsdistrict",goodsdistrict);
        criteria.andGoodsdistrictEqualTo(goodsdistrict);
        List<Goods> goods = goodsService.selectByExample(example);
        model.addAttribute("list",goods);
        return "select";

    }
    @RequestMapping("updatecha")
    public  String updatecha(Integer id,Model model){
        Goods goods = goodsService.selectByPrimaryKey(id);
        model.addAttribute("goods",goods);
return "update";
    }
    @RequestMapping("update")
    public  String update(Goods goods,Model model,HttpSession session){
        int i = goodsService.updateByPrimaryKeySelective(goods);

        if (i>0) {
            Integer goodsdistrict = (Integer) session.getAttribute("goodsdistrict");
            GoodsExample example=new GoodsExample();
            GoodsExample.Criteria criteria = example.createCriteria();
            session.setAttribute("goodsdistrict",goodsdistrict);
            criteria.andGoodsdistrictEqualTo(goodsdistrict);
            List<Goods> goodss = goodsService.selectByExample(example);
            model.addAttribute("list",goodss);
            return "select";
        }else {
            return "redirect:index";
        }


    }
}
