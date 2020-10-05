package com.kgc.zhang.controller;

import com.kgc.zhang.entity.Assets;
import com.kgc.zhang.entity.AssetsExample;
import com.kgc.zhang.service.AssetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AssetsController {
    @Resource
    AssetsService assetsService;
    @RequestMapping("toinsert")
    public  String toinsert(){
        return "add";
    }
    @RequestMapping("toselect")
    public  String toselect(Model model,String assetname,String assettype){
        AssetsExample example=new AssetsExample();
        AssetsExample.Criteria criteria = example.createCriteria();
if (assetname!=null&&assetname.isEmpty()==false){
    criteria.andAssetidEqualTo(assetname);
}
        if (assettype!=null&&assettype.isEmpty()==false){
            criteria.andAssettypeEqualTo(assettype);
        }


        List<Assets> assets = assetsService.selectByExample(example);
        model.addAttribute("assets",assets);
        return "select";
    }




@RequestMapping("doadd")
    public  String doadd(Model model, Assets assets){
    int insert = assetsService.insert(assets);
    if (insert>0){
        model.addAttribute("suc","suc");
        return "add";
    }else {
        return "add";
    }
}
}
